package com.GestionCandidat.Repositories;

import com.GestionCandidat.entities.Candidat;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface CandidatRepository extends JpaRepository<Candidat,Long> {
}
