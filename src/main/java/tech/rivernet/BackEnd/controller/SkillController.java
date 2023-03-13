
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.rivernet.BackEnd.model.Skill;
import tech.rivernet.BackEnd.service.InterfaceSkillService;

@RestController
@RequestMapping("api/")
public class SkillController {
    
    @Autowired
    private InterfaceSkillService skillService;

    @PostMapping ("/new/skill")
    public void createSkill(@RequestBody Skill skill) {
        skillService.createSkill(skill);
    }    
    
    @GetMapping ("/view/skill")
    @ResponseBody
    public List<Skill> viewSkill() {
        return skillService.viewSkill();
    }


    @DeleteMapping ("/delete/skill/{id}")
    public void deleteSkill(@PathVariable int id) {
        skillService.deleteSkill(id);
    }

    @GetMapping ("/find/skill/{id}")
    @ResponseBody
    public Skill searchSkill(@PathVariable int id) {
        return skillService.searchSkill(id);
    }
    
    @PutMapping ("/edit/skill")
    public void editSkill(@RequestBody Skill skill) {
        skillService.editSkill(skill);
    }
}
