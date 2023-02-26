/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.Project;
import tech.rivernet.BackEnd.repository.ProjectRepository;

/**
 *
 * @author river
 */

@Service
public class ProjectService implements InterfaceProjectService{
    
    @Autowired
    public ProjectRepository projRepo;

    
    @Override
    public List<Project> viewProject() {
       return projRepo.findAll();    
    }

    @Override
    public void createProject(Project proj) {
        projRepo.save(proj);
    }

    @Override
    public void deleteProject(int id) {
        projRepo.deleteById(id);
    }

    @Override
    public Project searchProject(int id) {
        return projRepo.findById(id).orElse(null);
    }

    @Override
    public void editProject(Project proj) {
        projRepo.save(proj);
    }
    
    
    
}
