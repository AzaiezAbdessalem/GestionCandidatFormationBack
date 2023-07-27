package com.GestionCandidat.Services;

import com.GestionCandidat.entities.Candidat;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface CandidatService {
    void  createCandidat(Candidat c);
    List<Candidat> getCandidats();
    Candidat getOneCandidat(long id);

    void delete(long id);

    Candidat update(Candidat c,long id);
}
