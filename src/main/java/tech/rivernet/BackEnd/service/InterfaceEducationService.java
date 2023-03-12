
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Education;

public interface InterfaceEducationService {
    
    public List<Education> viewEducation();
    
    public void createEducation(Education education);
    
    public void deleteEducation(int id);
    
    public Education searchEducation(int id);
    
    public void editExperience(Education education); 
    
}
