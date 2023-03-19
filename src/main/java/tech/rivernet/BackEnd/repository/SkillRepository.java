
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.rivernet.BackEnd.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Integer>{    
}
