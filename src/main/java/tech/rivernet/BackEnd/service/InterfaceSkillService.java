/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Skill;

/**
 *
 * @author river
 */
public interface InterfaceSkillService {
    
     public List<Skill> viewSkill();
    
    public void createSkill(Skill skill);
    
    public void deleteSkill(int id);
    
    public Skill searchSkill(int id);
    
    public void editSkill(Skill skill); 
    
}
