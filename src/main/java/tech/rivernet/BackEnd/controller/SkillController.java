/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.rivernet.BackEnd.model.Skill;
import tech.rivernet.BackEnd.service.InterfaceSkillService;

/**
 *
 * @author river
 */

@RestController
@CrossOrigin("*")
public class SkillController {
    
    @Autowired
    private InterfaceSkillService skillService;

    @PostMapping ("skill/new")
    public void createSkill(@RequestBody Skill skill) {
        skillService.createSkill(skill);
    }    
    
    @GetMapping ("skill/view")
    @ResponseBody
    public List<Skill> viewSkill() {
        return skillService.viewSkill();
    }


    @DeleteMapping ("skill/delete/{id}")
    public void deleteSkill(@PathVariable int id) {
        skillService.deleteSkill(id);
    }

    @GetMapping ("skill/find/{id}")
    @ResponseBody
    public Skill searchSkill(int id) {
        return skillService.searchSkill(id);
    }
    
    @PutMapping ("skill/edit")
    public void editSkill(@RequestBody Skill skill) {
        skillService.editSkill(skill);
    }
}
