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
    private final EmailService emailService;
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
    public Profil getProfilByEmail(String email) {
        return profilRepository.getProfilByEmail(email);
    }

    @Override
    public void archiveProfil(Integer idProfil) {
        Profil p;
       p= profilRepository.findById(idProfil).orElse(null);
        if (p!=null){
            p.setArchived(false);
        }
        profilRepository.save(p);

    }
    @Override
    public void sendNewPasswordEmail(Profil p) {
        Profil profil = profilRepository.getProfilByEmail(p.getEmail());
        if (profil != null) {
            String subject = "New Password";
            String body = "Your new password is: " + p.getNewPassword();
            emailService.sendEmail(p.getEmail(), subject, body);
        }
    }
}
