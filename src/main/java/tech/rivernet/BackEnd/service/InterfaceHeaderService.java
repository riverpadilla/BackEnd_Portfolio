/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Education;
import tech.rivernet.BackEnd.model.Experience;
import tech.rivernet.BackEnd.model.Header;

/**
 *
 * @author river
 */

public interface InterfaceHeaderService {
    
    public List<Header> verHeader();
    
    public void crearHeader(Header header);
    
    public void borrarHeader(int id);
    
    public Header buscarHeader(int id);
    
    public void editarHeader(Header header);

    public void crearEducation(Education education);
    
    public List<Education> verEducation();
     
    public void crearExperience(Experience experience);

    public void editarEducation(Education education);
    
    
}
