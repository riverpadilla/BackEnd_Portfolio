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
import tech.rivernet.BackEnd.model.Project;
import tech.rivernet.BackEnd.service.InterfaceProjectService;

/**
 *
 * @author river
 */

@RestController
@CrossOrigin("*")
public class ProjectController {
    
    @Autowired
    private InterfaceProjectService projectService;

    @PostMapping ("project/new")
    public void createProject(@RequestBody Project project) {
        projectService.createProject(project);
    }    
    
    @GetMapping ("project/view")
    @ResponseBody
    public List<Project> viewProject() {
        return projectService.viewProject();
    }


    @DeleteMapping ("project/delete/{id}")
    public void deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
    }

    @GetMapping ("project/find/{id}")
    @ResponseBody
    public Project searchProject(@PathVariable int id) {
        return projectService.searchProject(id);
    }
    
    @PutMapping ("project/edit")
    public void editProject(@RequestBody Project project) {
        projectService.editProject(project);
    }
}
