package com.GestionCandidat.Services;

import com.GestionCandidat.entities.Formation;

import java.util.List;

public interface FormationService {
    void  createFormation(Formation f);
    List<Formation> findFormation();
    Formation findOneFormation(long id);
}
