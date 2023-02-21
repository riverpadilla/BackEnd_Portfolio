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
import tech.rivernet.BackEnd.model.Header;
import tech.rivernet.BackEnd.service.InterfaceHeaderService;

/**
 *
 * @author riverpadilla
 */

@RestController
@CrossOrigin("*")
public class HeaderController {
    
    @Autowired
    private InterfaceHeaderService headerService;
    
    @PostMapping("header/new")
    public void agregarHeader(@RequestBody Header header){
        headerService.createHeader(header);
    }
    
    @GetMapping ("header/view")
    @ResponseBody
    public List<Header> viewHeader(){
        return headerService.viewHeader();
    }
   
    @DeleteMapping("header/delete/{id}")
    public void deleteHeader(@PathVariable int id){
        headerService.deleteHeader(id);
    }
    
    @PutMapping("header/edit")
    public void editHeader(@RequestBody Header header){
        System.out.println(header);
        headerService.editHeader(header);
    }      
}
