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
public class Header {
    
    //Atributos
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String name;
    private String backImage;
    private String position;
    private String profileImage;
    private String location;
    private String email;
    private String about;

    //Constructor
    
    public Header() {
    }

    public Header
        (
            Integer id,
            String name,
            String backImage,
            String position,
            String profileImage,
            String location,
            String email,         
            String about
        ) 
    {
        this.id = id;
        this.name = name;
        this.backImage = backImage;
        this.position = position;
        this.profileImage = profileImage;
        this.location = location;
        this.email = email;
        this.about = about;
    }
    
}