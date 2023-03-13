
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
public class Experience{
    
    //atributos
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String logoUrl;
    private String description;
    private String position;
    private String company;
    private Boolean actualJob;
    private String startDate;
    private String endDate;
    private String city;
    private String country;
    
    //Constructor

    public Experience() {
    }

    public Experience
        (
            Integer id,
            String logoUrl,
            String description,
            String position,
            String company,
            Boolean actualJob,
            String startDate,
            String endDate,
            String city,
            String country
        )
    {
        this.id = id;
        this.logoUrl = logoUrl;
        this.description = description;
        this.position = position;
        this.company = company;
        this.actualJob = actualJob;
        this.startDate = startDate;
        this.endDate = endDate;
        this.city = city;
        this.country = country;
    }
    
}