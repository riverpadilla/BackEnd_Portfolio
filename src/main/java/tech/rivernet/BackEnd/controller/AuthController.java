/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.controller;

import jakarta.validation.Valid;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody
        ;
import tech.rivernet.BackEnd.model.Rol;
import tech.rivernet.BackEnd.model.User;

import tech.rivernet.BackEnd.security.DTO.JwtDTO;
import tech.rivernet.BackEnd.security.DTO.Message;
import tech.rivernet.BackEnd.security.DTO.NewUser;
import tech.rivernet.BackEnd.security.DTO.UserLogin;

import tech.rivernet.BackEnd.security.JWT.JwtProvider;

import tech.rivernet.BackEnd.security.RolName;

import tech.rivernet.BackEnd.service.RolService;
import tech.rivernet.BackEnd.service.UserService;

/**
 *
 * @author river
 */

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {
    
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/new")
    public ResponseEntity<?> createUser(@Valid @RequestBody NewUser newUser, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Message("campos vacíos"), HttpStatus.BAD_REQUEST);
        if(userService.existByUsername(newUser.getUsername()))
            return new ResponseEntity(new Message("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
           User user =
                new User(newUser.getUsername(),
                        passwordEncoder.encode(newUser.getPassword()));
        Set<String> rolesStr = newUser.getRoles();
        Set<Rol> roles = new HashSet<>();
        for (String rol : rolesStr) {
            switch (rol) {
                case "admin" -> {
                    Rol rolAdmin = rolService.getByRolName(RolName.ROLE_ADMIN).get();
                    roles.add(rolAdmin);
                }
                default -> {
                    Rol rolUser = rolService.getByRolName(RolName.ROLE_USER).get();
                    roles.add(rolUser);
                }
            }
        }
        user.setRoles(roles);
        userService.saveUser(user);
        return new ResponseEntity(new Message("usuario guardado"), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDTO> login(@Valid @RequestBody UserLogin userLogin, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Message("campos mal puestos"), HttpStatus.BAD_REQUEST);
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLogin.getUsername(), userLogin.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        JwtDTO jwtDto = new JwtDTO(jwt);
        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }
    
     @PostMapping("/refresh")
    public ResponseEntity<JwtDTO> refresh(@RequestBody JwtDTO jwtDto) throws ParseException {
        String token = jwtProvider.refreshToken(jwtDto);
        JwtDTO jwt = new JwtDTO(token);
        return new ResponseEntity(jwt, HttpStatus.OK);
    }
    
}
