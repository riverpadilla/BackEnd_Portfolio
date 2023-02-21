/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import tech.rivernet.BackEnd.model.Education;
import tech.rivernet.BackEnd.service.InterfaceEducationService;


/**
 *
 * @author river
 */

@RestController
@CrossOrigin("*")
public class EducationController {
    
    @Autowired
    private InterfaceEducationService educationService;
    
    @PostMapping("education/new")
    public void addEducation(@RequestBody Education education){
        System.out.println(education);
        educationService.createEducation(education);
    }
    
    @GetMapping ("education/view")
    @ResponseBody
    public List<Education> viewEducation(){
        return educationService.viewEducation();
    }
    
    @GetMapping ("education/find/{id}")
    @ResponseBody  
    public Education findEducation(@PathVariable int id){
        return educationService.searchEducation(id);
    }
   
    @DeleteMapping("education/delete/{id}")
    public void deleteEducation(@PathVariable int id){
        educationService.deleteEducation(id);
    }
    
    @PutMapping("education/edit")
    public void editEducation(@RequestBody Education education){
        System.out.println(education);
        educationService.editExperience(education);
    } 
    
}
