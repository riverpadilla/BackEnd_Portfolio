/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Education;

/**
 *
 * @author river
 */
public interface InterfaceEducationService {
    
    public List<Education> viewEducation();
    
    public void createEducation(Education education);
    
    public void deleteEducation(int id);
    
    public Education searchEducation(int id);
    
    public void editExperience(Education education); 
    
}
