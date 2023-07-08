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
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idContrat;
    String titre;
    String description;

    @ManyToOne
    @JsonIgnore
    Utilisateur utilisateur;

    @OneToOne(fetch = FetchType.LAZY, optional = true,cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    BienImmobiliere bienImmobiliere;
}
