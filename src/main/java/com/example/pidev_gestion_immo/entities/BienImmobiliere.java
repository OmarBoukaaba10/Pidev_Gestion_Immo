package com.example.pidev_gestion_immo.entities;

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
    Integer idBienImmo;

    String statut;
    String etat;
    String localisation;
    String description ;
    float prix;
    float superficie ;
    @Enumerated(EnumType.STRING)
    Type NatureBienImmo;

    @OneToOne(mappedBy = "bienImmobiliere")
    Annonce annonce;

    @OneToOne(mappedBy = "bienImmobiliere")
    Contrat contrat;

}
