
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

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
    private String startYear;
    private String endYear;
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
            String startYear,
            String endYear,
            String description
        ) 
    {
        this.id = id;
        this.school = school;
        this.title = title;
        this.logoUrl = logoUrl;
        this.startYear = startYear;
        this.endYear= endYear;
        this.description = description;
    } 
    
}