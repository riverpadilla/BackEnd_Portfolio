/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.Education;
import tech.rivernet.BackEnd.model.Experience;
import tech.rivernet.BackEnd.model.Header;
import tech.rivernet.BackEnd.repository.EducationRepository;
import tech.rivernet.BackEnd.repository.ExperienceRepository;
import tech.rivernet.BackEnd.repository.HeaderRepository;

/**
 *
 * @author river
 */

@Service
public class HeaderService implements InterfaceHeaderService{

    @Autowired
    public HeaderRepository headerRepo;
    
    @Autowired
    public EducationRepository eduRepo;
    
    @Autowired
    public ExperienceRepository expRepo;
    
    @Override
    public List<Header> verHeader() {
        return headerRepo.findAll();
    }

    @Override
    public void crearHeader(Header header) {
        headerRepo.save(header);
    }

    @Override
    public void borrarHeader(int id) {
        headerRepo.deleteById(id);
    }

    @Override
    public Header buscarHeader(int id) {
        
        return headerRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHeader(Header header) {
        headerRepo.save(header);
    }

  
    @Override
    public List<Education> verEducation() {
        return eduRepo.findAll();
    }
    
    @Override
    public void crearEducation(Education education) {
        eduRepo.save(education);
    }
    
    @Override
    public void crearExperience(Experience experience) {
        expRepo.save(experience);
    }

    @Override
    public void editarEducation(Education education) {
        eduRepo.save(education);
    }
    
    
    
}