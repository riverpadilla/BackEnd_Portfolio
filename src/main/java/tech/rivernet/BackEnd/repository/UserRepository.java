/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.rivernet.BackEnd.model.User;

/**
 *
 * @author river
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByUsername(String nu);
    Optional<User> findByTokenPassword(String tokenPassword);
    boolean existsByUsername(String nu);
}