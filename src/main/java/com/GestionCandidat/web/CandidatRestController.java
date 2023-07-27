package com.GestionCandidat.web;

import com.GestionCandidat.Services.CandidatService;
import com.GestionCandidat.Services.FormationService;
import com.GestionCandidat.entities.Candidat;
import com.GestionCandidat.models.CandidatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value="*")
public class CandidatRestController {
    @Autowired
    private CandidatService candidatService;
    @Autowired FormationService formationService;
    @PostMapping("/candidats")
    void  createCandidat(@RequestBody CandidatModel c){
        Candidat candidat = new Candidat();
        candidat.setCandidatFirstName(c.getCandidatFirstName());
        candidat.setCandidatLastName(c.getCandidatLastName());
        candidat.setCandidatSpecialite(c.getCandidatSpecialite());
        candidat.setCandidatNiveau(c.getCandidatNiveau());
        candidat.setFormation(this.formationService.findOneFormation(c.getFormationId()));
        this.candidatService.createCandidat(candidat);
    }
    @GetMapping("/candidats")
    List<Candidat>findAllCandidats(){
        return this.candidatService.getCandidats();
    }
    @GetMapping("/candidats/{id}")
    Candidat getOneCandidat(@PathVariable long id){
        return  this.candidatService.getOneCandidat(id);

    }
    @DeleteMapping("/candidats/delete/{id}")
    public void  deleteCandidat(@PathVariable long id){
        this.candidatService.delete(id);

    }
@PutMapping("/candidats/update/{id}")
public Candidat updateCandidat(@RequestBody CandidatModel c,@PathVariable long id) {
        Candidat candidat = new Candidat();
        candidat.setCandidatFirstName(c.getCandidatFirstName());
        candidat.setCandidatLastName(c.getCandidatLastName());
        candidat.setCandidatSpecialite(c.getCandidatSpecialite());
        candidat.setCandidatNiveau(c.getCandidatNiveau());
        candidat.setFormation(this.formationService.findOneFormation(c.getFormationId()));

        return this.candidatService.update(candidat,id);
    }
}
