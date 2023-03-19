
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
import tech.rivernet.BackEnd.model.Education;
import tech.rivernet.BackEnd.service.InterfaceEducationService;

@RestController
@RequestMapping("api/")
public class EducationController {
    
    @Autowired
    private InterfaceEducationService educationService;
    
    @PostMapping("new/education")
    public void addEducation(@RequestBody Education education){
        educationService.createEducation(education);
    }
    
    @GetMapping ("view/education")
    @ResponseBody
    public List<Education> viewEducation(){
        return educationService.viewEducation();
    }
    
    @GetMapping ("find/education/{id}")
    @ResponseBody  
    public Education findEducation(@PathVariable int id){
        return educationService.searchEducation(id);
    }
   
    @DeleteMapping("delete/education/{id}")
    public void deleteEducation(@PathVariable int id){
        educationService.deleteEducation(id);
    }
    
    @PutMapping("/edit/education")
    public void editEducation(@RequestBody Education education){
        educationService.editExperience(education);
    } 
    
}
