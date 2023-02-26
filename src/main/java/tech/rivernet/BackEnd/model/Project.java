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
public class Project {
    
    //Atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String title;
    private String description;
    
    
    //Constructor

    public Project() {
    }

    public Project
        (
            Integer id,
            String title,
            String description
        ) 
        {
            this.id = id;
            this.title = title;
            this.description = description;
        }
    
    
    
    
}
