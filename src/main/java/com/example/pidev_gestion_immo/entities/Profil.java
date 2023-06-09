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
public class Profil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProfil;
    String nom;
    String prenom;
    String email;
    String ancienPassword;
    String newPassword;
    Integer numTel;
    Boolean archived ;

    @OneToOne(mappedBy = "profil")
    Utilisateur utilisateur;
}
