package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Profil;
import com.example.pidev_gestion_immo.repository.ProfilRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProfilServiceImpl implements IProfilService{
    ProfilRepository profilRepository;
    @Override
    public List<Profil> retrieveAllProfils() {
        return profilRepository.findAll();
    }

    @Override
    public Profil addProfil(Profil e) {
        return profilRepository.save(e);
    }

    @Override
    public Profil updateProfil(Profil e) {
        return profilRepository.save(e);
    }

    @Override
    public Profil retrieveProfil(Integer idProfil) {
        return profilRepository.findById(idProfil).orElse(null);
    }

    @Override
    public void archiveProfil(Integer idProfil) {
        Profil p;
       p= profilRepository.findById(idProfil).orElse(null);
        if (p!=null){
            p.setArchived(true);
        }
        profilRepository.save(p);

    }
}
