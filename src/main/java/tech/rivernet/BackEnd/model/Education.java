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
public class Education{
    
    //atributos
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String school;
    private String title;
    private String logoUrl;
    private String startDate;
    private String endDate;
    private String description;
    
    
    //Constructor

    public Education() {
    }
      
    public Education
        (
            Integer id,
            String school,
            String title,
            String logoUrl,
            String startDate,
            String endDate,
            String description
        ) 
    {
        this.id = id;
        this.school = school;
        this.title = title;
        this.logoUrl = logoUrl;
        this.startDate = startDate;
        this.endDate= endDate;
        this.description = description;
    } 
    
}