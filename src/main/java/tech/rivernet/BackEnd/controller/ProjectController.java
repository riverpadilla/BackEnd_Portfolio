
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
import tech.rivernet.BackEnd.model.Project;
import tech.rivernet.BackEnd.service.InterfaceProjectService;

@RestController
@RequestMapping("api/")
public class ProjectController {
    
    @Autowired
    private InterfaceProjectService projectService;

    @PostMapping ("new/project")
    public void createProject(@RequestBody Project project) {
        projectService.createProject(project);
    }    
    
    @GetMapping ("view/project")
    @ResponseBody
    public List<Project> viewProject() {
        return projectService.viewProject();
    }


    @DeleteMapping ("delete/project/{id}")
    public void deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
    }

    @GetMapping ("find/project/{id}")
    @ResponseBody
    public Project searchProject(@PathVariable int id) {
        return projectService.searchProject(id);
    }
    
    @PutMapping ("edit/project")
    public void editProject(@RequestBody Project project) {
        projectService.editProject(project);
    }
}
