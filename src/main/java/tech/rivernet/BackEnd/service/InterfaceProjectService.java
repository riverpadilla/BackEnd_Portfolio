
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Project;

public interface InterfaceProjectService {
    
     public List<Project> viewProject();
    
    public void createProject(Project skill);
    
    public void deleteProject(int id);
    
    public Project searchProject(int id);
    
    public void editProject(Project skill); 
    
}
