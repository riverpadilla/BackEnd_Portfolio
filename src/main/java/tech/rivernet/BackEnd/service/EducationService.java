
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.Education;
import tech.rivernet.BackEnd.repository.EducationRepository;

@Service
public class EducationService implements InterfaceEducationService{
    
    @Autowired
    public EducationRepository eduRepo;

    @Override
    public List<Education> viewEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void createEducation(Education education) {
        eduRepo.save(education);
    }

    @Override
    public void deleteEducation(int id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Education searchEducation(int id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void editExperience(Education education) {
        eduRepo.save(education);
    }
    
    
    
}
