/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.Perfil;
import tech.rivernet.BackEnd.repository.PerfilRepository;

/**
 *
 * @author river
 */

@Service
public class PerfilService implements InterfacePerfilService{

    @Autowired
    public PerfilRepository perfilRepo;
    
    @Override
    public List<Perfil> verPerfil() {
        return perfilRepo.findAll();
    }

    @Override
    public void crearPerfil(Perfil perfil) {
        perfilRepo.save(perfil);
    }

    @Override
    public void borrarPerfil(int id) {
        perfilRepo.deleteById(id);
    }

    @Override
    public Perfil buscarPerfil(int id) {
        
        return perfilRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPerfil(Perfil perfil) {
        perfilRepo.save(perfil);
    }
    
    
    
}