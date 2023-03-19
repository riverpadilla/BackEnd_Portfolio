
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Experience;

public interface InterfaceExperienceService {
        
    public List<Experience> viewExperience();
    
    public void createExperience(Experience experience);
    
    public void deleteExperience(int id);
    
    public Experience searchExperience(int id);
    
    public void editExperience(Experience experience); 

}
