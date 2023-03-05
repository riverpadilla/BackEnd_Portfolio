/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.security;

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

/**
 *
 * @author river
 */

@RestController
@CrossOrigin("*")
public class LoginController {
    
    @Autowired
    private InterfaceLoginService loginService;

    @PostMapping ("login/new")
    public void createLogin(@RequestBody Login login) {
        loginService.createLogin(login);
    }    
    
    @GetMapping ("login/view")
    @ResponseBody
    public List<Login> viewLogin() {
        return loginService.viewLogin();
    }


    @DeleteMapping ("login/delete/{id}")
    public void deleteLogin(@PathVariable int id) {
        loginService.deleteLogin(id);
    }

    @GetMapping ("login/find/{id}")
    @ResponseBody
    public Login searchLogin(@PathVariable int id) {
        return loginService.searchLogin(id);
    }
    
    @PutMapping ("login/edit")
    public void editLogin(@RequestBody Login login) {
        loginService.editLogin(login);
    }
}
