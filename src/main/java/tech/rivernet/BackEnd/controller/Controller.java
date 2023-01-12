/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.rivernet.BackEnd.model.Perfil;
import tech.rivernet.BackEnd.service.InterfacePerfilService;

/**
 *
 * @author riverpadilla
 */

@RestController
public class Controller {
    
    @Autowired
    private InterfacePerfilService perfilService;
    
    @PostMapping("/new/perfil")
    public void agregarPerfil(@RequestBody Perfil perfil){
        perfilService.crearPerfil(perfil);
    }
    
    @GetMapping ("/ver/perfil")
    @ResponseBody
    public List<Perfil> verPerfil(){
        return perfilService.verPerfil();
    }
   
    @DeleteMapping("/delete/{id}")
    public void borrarPerfil(@PathVariable int id){
        perfilService.borrarPerfil(id);
    }
    
    @PutMapping("/edit/perfil")
    public void editarPerfil(@RequestBody Perfil perfil){
        perfilService.editarPerfil(perfil);
    }
}
