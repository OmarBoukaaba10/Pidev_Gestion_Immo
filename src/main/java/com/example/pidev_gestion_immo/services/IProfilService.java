package com.example.pidev_gestion_immo.services;


import com.example.pidev_gestion_immo.entities.Profil;

import java.util.List;


public interface IProfilService {
    List<Profil> retrieveAllProfils();

    Profil addProfil(Profil e);

    Profil updateProfil (Profil e);

    Profil retrieveProfil (Integer idProfil);

    void archiveProfil(Integer idProfil);
}
