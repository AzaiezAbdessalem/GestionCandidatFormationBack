package com.GestionCandidat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Candidat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidat implements Serializable {
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String candidatFirstName;
    private String candidatLastName;
    private String candidatSpecialite;
    private String candidatNiveau;
    @ManyToOne
    Formation formation;
}
