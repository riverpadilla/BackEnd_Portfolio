/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.security.DTO;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author river
 */

@Getter @Setter
public class JwtDTO {
    
    private String token;

    public JwtDTO(String token) {
        this.token = token;
    }
    
}
