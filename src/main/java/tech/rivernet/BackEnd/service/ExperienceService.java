/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.Experience;
import tech.rivernet.BackEnd.repository.ExperienceRepository;

/**
 *
 * @author river
 */

@Service
public class ExperienceService implements InterfaceExperienceService{
    
    @Autowired
    public ExperienceRepository expRepo;

    @Override
    public List<Experience> viewExperience() {
         return expRepo.findAll();
    }

    @Override
    public void createExperience(Experience experience) {
        expRepo.save(experience);
    }

    @Override
    public void deleteExperience(int id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience searchExperience(int id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void editExperience(Experience experience) {
        expRepo.save(experience);
    }
}
 
   
    
   
    
