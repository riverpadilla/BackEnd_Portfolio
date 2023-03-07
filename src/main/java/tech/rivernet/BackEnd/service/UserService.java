/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.User;
import tech.rivernet.BackEnd.repository.UserRepository;

/**
 *
 * @author river
 */

@Service
public class UserService{
    
    @Autowired
    public UserRepository userRepo;

    
  public Optional<User> getByUserName(String nu){
        return userRepo.findByUsername(nu);
    }
  
  public Optional<User> getByTokenPassword(String tokenPassword){
        return userRepo.findByTokenPassword(tokenPassword);
    }

    public boolean existByName(String nu){
        return userRepo.existsByUsername(nu);
    }


    public void saveUser(User user){
        userRepo.save(user);
    }
    
    
    
}
