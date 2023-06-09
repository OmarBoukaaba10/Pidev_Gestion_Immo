package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Profil;
import com.example.pidev_gestion_immo.entities.Utilisateur;
import com.example.pidev_gestion_immo.repository.ProfilRepository;
import com.example.pidev_gestion_immo.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements IUtilisateurService{
    UtilisateurRepository utilisateurRepository;
    ProfilRepository profilRepository;
    @Override
    public List<Utilisateur> retrieveAllUsers() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur addUser(Utilisateur e) {
        return utilisateurRepository.save(e);
    }

    @Override
    public Utilisateur updateUser(Utilisateur e) {
        return utilisateurRepository.save(e);
    }

    @Override
    public Utilisateur retrieveUser(Integer idUser) {
        return utilisateurRepository.findById(idUser).orElse(null);
    }

    @Override
    public void archiveUser(Integer idUser) {
        Utilisateur u;
        u= utilisateurRepository.findById(idUser).orElse(null);
        if (u!=null){
            u.getProfil().setArchived(true);
        }
        utilisateurRepository.save(u);

    }
}
