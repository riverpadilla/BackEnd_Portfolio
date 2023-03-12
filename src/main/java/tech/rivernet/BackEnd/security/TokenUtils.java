
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.sql.Date;
import java.util.Collections;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class TokenUtils {
    
    private final static  String ACCESS_TOKEN_SECRET = "$2a$10$SO6lJhBlsJyxsqULkq7BQeHSpT2IHB7c2bhJ2dmsvW8UDOAMZGUQe";
    private final static Long ACCESS_TOKEN_VALIDITY_SECONDS = 2_592_000L;
    
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
        System.out.println("username: " + username);

        
        return new UsernamePasswordAuthenticationToken( username, null, Collections.emptyList());
        } catch (JwtException e) {
            return null;
        }
    }
    
}
