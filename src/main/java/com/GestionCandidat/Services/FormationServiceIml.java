package com.GestionCandidat.Services;

import com.GestionCandidat.Repositories.FormationRepository;
import com.GestionCandidat.entities.Formation;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FormationServiceIml implements  FormationService{
    final private FormationRepository formationRepository;
    public FormationServiceIml(FormationRepository formationRepository){
        this.formationRepository = formationRepository;

    }
    @Override
    public void createFormation(Formation f) {
        this.formationRepository.save(f);
    }

    @Override
    public List<Formation> findFormation() {
        return this.formationRepository.findAll();
    }

    @Override
    public Formation findOneFormation(long id) {

        return this.formationRepository.findById(id).get();
    }
}
