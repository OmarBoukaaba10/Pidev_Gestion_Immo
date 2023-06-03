package com.example.pidev_gestion_immo.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Profil implements Serializable {
    @Id
    Integer idProfil;
    String nom;
    String prenom;
    String email;
    String ancienPassword;
    String newPassword;
    Integer numTel;

    @OneToOne(mappedBy = "profil")
    Utilisateur utilisateur;
}
