/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Perfil;

/**
 *
 * @author river
 */

public interface InterfacePerfilService {
    
    public List<Perfil> verPerfil();
    
    public void crearPerfil(Perfil perfil);
    
    public void borrarPerfil(int id);
    
    public Perfil buscarPerfil(int id);
    
    public void editarPerfil(Perfil perfil);
    
    
}
