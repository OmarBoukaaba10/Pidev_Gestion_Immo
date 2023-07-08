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
public class Annonce implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idAnnonce;

    String name;
    String description;
    Integer src;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JsonIgnore
    Utilisateur utilisateur;

    @OneToOne(fetch = FetchType.LAZY, optional = true)
    @JsonIgnore
    BienImmobiliere bienImmobiliere;

    @OneToOne(fetch = FetchType.LAZY, optional = true)
    @JsonIgnore
    Image image;

    @ManyToOne
    @JsonIgnore

    Promotion promotion;

}

