/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.security;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author river
 */

@Getter @Setter
@Entity
public class Login {
   
    //Atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String user;
    private String password;
    
    
    
    //Constructor
    
    

    public Login() {
    }

    public Login
        (
            Integer id, 
            String user, 
            String password
       ) 
    {
        this.id = id;
        this.user = user;
        this.password = password;
    }
        
}
