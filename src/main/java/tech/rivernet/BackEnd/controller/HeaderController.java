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
import tech.rivernet.BackEnd.model.Experience;
import tech.rivernet.BackEnd.model.Header;
import tech.rivernet.BackEnd.service.InterfaceHeaderService;

/**
 *
 * @author riverpadilla
 */

@RestController
@CrossOrigin(origins = "http://localhost:4000")
public class HeaderController {
    
    @Autowired
    private InterfaceHeaderService headerService;
    
    @PostMapping("header/new")
    public void agregarHeader(@RequestBody Header header){
        headerService.crearHeader(header);
    }
    
    @GetMapping ("header/view")
    @ResponseBody
    public List<Header> verHeader(){
        return headerService.verHeader();
    }
   
    @DeleteMapping("header/delete/{id}")
    public void borrarHeader(@PathVariable int id){
        headerService.borrarHeader(id);
    }
    
    @PutMapping("/header/edit")
    public void editarHeader(@RequestBody Header header){
        headerService.editarHeader(header);
    }
    
    @GetMapping ("/ver/education")
    @ResponseBody
    public List<Education> verEducation(){
        return headerService.verEducation();
    }
    
    @PostMapping("/new/education")
    public void agregarEducation(@RequestBody Education education){
        headerService.crearEducation(education);
    }
    
    @PutMapping("/edit/education")
    public void editarEducation(@RequestBody Education education){
        headerService.editarEducation(education);
    }
    
    @PostMapping("/new/experience")
    public void agregarExperience(@RequestBody Experience experience){
        headerService.crearExperience(experience);
    }
    
    
}
