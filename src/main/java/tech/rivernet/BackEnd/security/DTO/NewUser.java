/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.security.DTO;

import jakarta.validation.constraints.NotBlank;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author river
 */

 @Getter @Setter
public class NewUser {
       
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private Set<String> roles;
    
}
