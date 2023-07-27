package com.GestionCandidat.Services;

import com.GestionCandidat.Repositories.CandidatRepository;
import com.GestionCandidat.entities.Candidat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.*;

@Service
public class CandidatServiceImp implements CandidatService{
    final private CandidatRepository candidatRepository;
    public  CandidatServiceImp(CandidatRepository candidatRepository){
        this.candidatRepository = candidatRepository;
    }
    @Override
    public void createCandidat(Candidat c) {
        this.candidatRepository.save(c);

    }

    @Override
    public List<Candidat> getCandidats() {
        return this.candidatRepository.findAll();
    }

    @Override
    public Candidat getOneCandidat(long id) {
        return this.candidatRepository.findById(id).get();
    }

    @Override
    public void delete(long id) {
        this.candidatRepository.deleteById(id);
    }

    @Override
    public Candidat update(Candidat c, long id) {

        Candidat candidat= this.getOneCandidat(id);

        candidat.setCandidatFirstName(c.getCandidatFirstName());
        candidat.setCandidatLastName(c.getCandidatLastName());
        candidat.setCandidatSpecialite(c.getCandidatSpecialite());
        candidat.setCandidatNiveau(c.getCandidatNiveau());

        return this.candidatRepository.save(candidat);

    }


}
