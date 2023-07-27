package com.GestionCandidat.web;

import com.GestionCandidat.Services.FormationService;
import com.GestionCandidat.entities.Formation;
import com.GestionCandidat.models.FormationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value="*")

public class FormationRestController {
    @Autowired
    FormationService formationService;
    @PostMapping("/formations")
    void createFormation(@RequestBody FormationModel model){
        Formation formation = new Formation();
        formation.setFormationName(model.getFormationName());
        formation.setDuree(model.getDuree());
        this.formationService.createFormation(formation);
    }
    @GetMapping("/formations")
    List<Formation> Formations(){
        return  this.formationService.findFormation();
    }
    @GetMapping("/formations/{id}")
    Formation getOneFormation(@PathVariable long id){
        return  this.formationService.findOneFormation(id);
    }
}
