/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.sql.Date;
import java.util.Collections;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 *
 * @author river
 */
public class TokenUtils {
    
    private final static  String ACCESS_TOKEN_SECRET = "$2a$10$SO6lJhBlsJyxsqULkq7BQeHSpT2IHB7c2bhJ2dmsvW8UDOAMZGUQe";
    private final static Long ACCESS_TOKEN_VALIDITY_SECONDS = 360_000L;
    
    public static String createToken(String username){
        Long expirationTime = ACCESS_TOKEN_VALIDITY_SECONDS * 1000;
        Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);
        
        return Jwts.builder()
                .setSubject(username)
                .setExpiration(expirationDate)
                .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
                .compact();
    }
    
    public static UsernamePasswordAuthenticationToken getAuthenticationToken(String token){
        try {
            Claims claims = Jwts.parserBuilder()
                .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();
        
        String username = claims.getSubject();
        
        return new UsernamePasswordAuthenticationToken( username, null, Collections.emptyList());
        } catch (JwtException e) {
            return null;
        }
    }
    
}
