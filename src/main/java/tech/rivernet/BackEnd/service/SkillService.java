
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.Skill;
import tech.rivernet.BackEnd.repository.SkillRepository;

@Service
public class SkillService implements InterfaceSkillService{
    
    @Autowired
    public SkillRepository skillRepo;

    
    @Override
    public List<Skill> viewSkill() {
       return skillRepo.findAll();    }

    @Override
    public void createSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(int id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill searchSkill(int id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void editSkill(Skill skill) {
        skillRepo.save(skill);
    }
    
    
    
}
