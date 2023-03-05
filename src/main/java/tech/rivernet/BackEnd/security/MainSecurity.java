/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import tech.rivernet.BackEnd.security.JWT.JwtEntryPoint;
import tech.rivernet.BackEnd.security.JWT.JwtTokenFilter;
import tech.rivernet.BackEnd.service.UserDetailsServiceImpl;

/**
 *
 * @author river
 */

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class MainSecurity {
    
    @Autowired
    UserDetailsServiceImpl userDetailsServiceImpl;

    @Autowired
    JwtEntryPoint jwtEntryPoint;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Autowired
    JwtTokenFilter JwtTokenFilter;
    
    AuthenticationManager authenticationManager;

    @Bean
    public SecurityFilterChain securityFilterChainilterChain(HttpSecurity http) throws Exception{
        
        AuthenticationManagerBuilder builder = http.getSharedObject(AuthenticationManagerBuilder.class);
        builder.userDetailsService(userDetailsServiceImpl).passwordEncoder(passwordEncoder);
        authenticationManager = builder.build();
        
        http.authenticationManager(authenticationManager);
        http.csrf().disable();
        http.cors();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
        http.authorizeHttpRequests().requestMatchers(
                "/api/auth/**",
                "v2/spi-docs",
                "configuration/**"
        )
        .permitAll().anyRequest().authenticated();
        
        http.exceptionHandling().authenticationEntryPoint(jwtEntryPoint);
        http.addFilterBefore(JwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
        
        return http.build();
    }
    
}
