package com.GestionCandidat.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidatModel {
    private String candidatFirstName;
    private String candidatLastName;
    private String candidatSpecialite;
    private String candidatNiveau;
    private  long formationId;
}
