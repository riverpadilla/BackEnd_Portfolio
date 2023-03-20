
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    
    @Bean
    @SuppressWarnings("Convert2Lambda")
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/login")
                        .allowedOrigins("http://localhost:4000")
                        .allowedOrigins("http://181.51.34.186:4000")
                        .allowedOrigins("https://argentina-programa-2022.web.app")
                        .allowedMethods("*")
                        .exposedHeaders("*");
                
                registry.addMapping("/api/**")
                        .allowedOrigins("http://localhost:4000")
                        .allowedOrigins("http://181.51.34.186:4000")
                        .allowedOrigins("https://argentina-programa-2022.web.app")
                        .allowedMethods("*");
                        
            }

   
        
        };
    }
     
}
