/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.rivernet.BackEnd.model.Project;

/**
 *
 * @author river
 */

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer>{    
}
