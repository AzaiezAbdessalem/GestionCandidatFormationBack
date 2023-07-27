package com.GestionCandidat.Repositories;

import com.GestionCandidat.entities.Formation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface FormationRepository extends JpaRepository<Formation,Long> {
}
