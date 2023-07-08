package com.example.pidev_gestion_immo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BienImmobiliere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idBienImmo;

    String statut;
    String etat;
    String localisation;
    String description;
    float prix;
    float superficiesuperficie;
    @Enumerated(EnumType.STRING)
    NatureBienImmo natureBienImmo;

    @OneToOne(mappedBy = "bienImmobiliere" ,fetch = FetchType.LAZY, optional = true)
    @JsonIgnore
    Annonce annonce;

    @OneToOne(mappedBy = "bienImmobiliere",fetch = FetchType.LAZY, optional = true)
    @JsonIgnore
    Contrat contrat;

}
