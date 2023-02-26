/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Project;

/**
 *
 * @author river
 */
public interface InterfaceProjectService {
    
     public List<Project> viewProject();
    
    public void createProject(Project skill);
    
    public void deleteProject(int id);
    
    public Project searchProject(int id);
    
    public void editProject(Project skill); 
    
}
