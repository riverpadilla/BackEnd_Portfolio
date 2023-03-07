/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.rivernet.BackEnd.model.Rol;
import tech.rivernet.BackEnd.security.RolName;
import tech.rivernet.BackEnd.repository.RolRepository;

/**
 *
 * @author river
 */

@Service
@Transactional
public class RolService{
    
    @Autowired
    public RolRepository rolRepo;

    
  public Optional<Rol> getByRolName(RolName rolName){
        return rolRepo.findByRolName(rolName);
    }  
  
   public void rolSave(Rol rol){
        rolRepo.save(rol);
    }
}
