package com.example.pidev_gestion_immo.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idUser;
    String  login;
    String  password;
    @Enumerated(EnumType.STRING)
    Type type;

    @OneToOne(cascade = CascadeType.ALL)
    Profil profil;

    @ManyToMany
    Set<Role> roles;

    @OneToMany(mappedBy = "utilisateur")
    Set<Annonce> annonces;

    @OneToMany(mappedBy = "utilisateur")
    Set<Reclamation> reclamations;

    @OneToMany(mappedBy = "utilisateur")
    Set<Contrat> contrats;
}
