
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
public class Skill {
   
    //Atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String description;
    private String grade;
    
    
    
    //Constructor
    
    

    public Skill() {
    }

    public Skill
        (
            Integer id, 
            String description, 
            String grade
       ) 
    {
        this.id = id;
        this.description = description;
        this.grade = grade;
    }
        
}
