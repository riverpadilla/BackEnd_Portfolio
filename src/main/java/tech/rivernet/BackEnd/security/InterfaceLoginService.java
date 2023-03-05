/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.security;

import java.util.List;

/**
 *
 * @author river
 */

public interface InterfaceLoginService {
    
    public List<Login> viewLogin();
    
    public void createLogin(Login login);
    
    public void deleteLogin(int id);
    
    public Login searchLogin(int id);
    
    public void editLogin(Login login); 
    
}
