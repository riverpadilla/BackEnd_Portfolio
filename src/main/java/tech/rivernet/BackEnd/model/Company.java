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
public class Company{
    
    //atributos
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String companyName;
    private String logoUrl;
    private String companyUrl;
    
    //Constructor

    public Company() {
    }

    public Company(String companyName, String logoUrl, String companyUrl) {
        this.companyName = companyName;
        this.logoUrl = logoUrl;
        this.companyUrl = companyUrl;
    }
    
    //Getter & Setter

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompnyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }
    
}