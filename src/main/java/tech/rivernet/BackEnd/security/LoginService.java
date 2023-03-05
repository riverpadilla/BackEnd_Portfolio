/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.security;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author river
 */

@Service
public class LoginService implements InterfaceLoginService{
    
    @Autowired
    public LoginRepository loginRepo;

    
    @Override
    public List<Rol> viewLogin() {
       return loginRepo.findAll();    }

    @Override
    public void createLogin(Rol login) {
        loginRepo.save(login);
    }

    @Override
    public void deleteLogin(int id) {
        loginRepo.deleteById(id);
    }

    @Override
    public Rol searchLogin(int id) {
        return loginRepo.findById(id).orElse(null);
    }

    @Override
    public void editLogin(Rol login) {
        loginRepo.save(login);
    }
    
    
    
}
