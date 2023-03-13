
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.rivernet.BackEnd.model.Experience;
import tech.rivernet.BackEnd.service.InterfaceExperienceService; 
    
@RestController
@RequestMapping("api/")
public class ExperienceController {
    
    @Autowired
    private InterfaceExperienceService experienceService;
    
    @PostMapping("new/experience")
    public void addExperience(@RequestBody Experience experience){
        experienceService.createExperience(experience);
    }
    
    @GetMapping("view/experience")
    @ResponseBody
    public List<Experience> viewExperience(){
        return experienceService.viewExperience();
    }
    
    @GetMapping ("find/experience/{id}")
    @ResponseBody  
    public Experience searchExperience(@PathVariable int id){
        return experienceService.searchExperience(id);
    }
   
    @DeleteMapping ("delete/experience/{id}")
    public void deleteExperience(@PathVariable int id){
        experienceService.deleteExperience(id);
    }
    
    @PutMapping ("edit/experience")
    public void editExperience(@RequestBody Experience experience){
        experienceService.editExperience(experience);
    } 
}