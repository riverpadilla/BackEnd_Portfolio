/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.rivernet.BackEnd.model.Experience;
import tech.rivernet.BackEnd.service.InterfaceExperienceService;

/**
 *
 * @author river
 */
    
    
@RestController
@CrossOrigin("*")
public class ExperienceController {
    
    @Autowired
    private InterfaceExperienceService experienceService;
    
    @PostMapping("experience/new")
    public void addExperience(@RequestBody Experience experience){
        experienceService.createExperience(experience);
    }
    
    @GetMapping ("experience/view")
    @ResponseBody
    public List<Experience> viewExperience(){
        return experienceService.viewExperience();
    }
    
    @GetMapping ("experience/find/{id}")
    @ResponseBody  
    public Experience searchExperience(@PathVariable int id){
        return experienceService.searchExperience(id);
    }
   
    @DeleteMapping ("experience/delete/{id}")
    public void deleteExperience(@PathVariable int id){
        experienceService.deleteExperience(id);
    }
    
    @PutMapping ("experience/edit")
    public void editExperience(@RequestBody Experience experience){
        experienceService.editExperience(experience);
    } 
}