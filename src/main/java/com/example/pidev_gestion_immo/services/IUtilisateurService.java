package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    List<Utilisateur> retrieveAllUsers();

    Utilisateur addUser(Utilisateur e);

    Utilisateur updateUser (Utilisateur e);

    Utilisateur retrieveUser (Integer idUser);

    void archiveUser(Integer idUser);
    void activerUser(Integer idUser);
}
