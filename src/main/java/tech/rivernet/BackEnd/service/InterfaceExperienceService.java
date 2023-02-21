/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Experience;

/**
 *
 * @author river
 */
public interface InterfaceExperienceService {
    
    
    public List<Experience> viewExperience();
    
    public void createExperience(Experience experience);
    
    public void deleteExperience(int id);
    
    public Experience searchExperience(int id);
    
    public void editExperience(Experience experience); 

}
