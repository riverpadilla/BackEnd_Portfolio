
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Skill;

public interface InterfaceSkillService {
    
     public List<Skill> viewSkill();
    
    public void createSkill(Skill skill);
    
    public void deleteSkill(int id);
    
    public Skill searchSkill(int id);
    
    public void editSkill(Skill skill); 
    
}
