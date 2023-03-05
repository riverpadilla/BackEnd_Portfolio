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
    
    public List<Rol> viewLogin();
    
    public void createLogin(Rol login);
    
    public void deleteLogin(int id);
    
    public Rol searchLogin(int id);
    
    public void editLogin(Rol login); 
    
}
