/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.model;

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
public class Perfil {
    
    //Atributos
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String firstName;
    private String lastName;
    private String backImage;
    private String position;
    private String profileImage;
    private String location;
    private String email;
    private String companyName;
    private String logoUrl;
    private String companyUrl;
    private String about;

    //Constructor
    
    public Perfil() {
    }

    public Perfil
        (
            Integer id,
            String firstName,
            String lastName,
            String backImage,
            String position,
            String profileImage,
            String location,
            String email,         
            String companyName,
            String logoUrl,
            String companyUrl,
            String about
        ) 
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.backImage = backImage;
        this.position = position;
        this.profileImage = profileImage;
        this.location = location;
        this.email = email;
        this.companyName = companyName;
        this.logoUrl = logoUrl;
        this.companyUrl = companyUrl;
        this.about = about;
    }
    
}