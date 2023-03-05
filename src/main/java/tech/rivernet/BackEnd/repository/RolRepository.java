/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.rivernet.BackEnd.model.Rol;
import tech.rivernet.BackEnd.security.RolName;

/**
 *
 * @author river
 */

@Repository
public interface RolRepository extends JpaRepository<Rol,Long>{
    Optional<Rol> findByRolName(RolName rolName);
}
