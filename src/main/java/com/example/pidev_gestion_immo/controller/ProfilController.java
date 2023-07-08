package com.example.pidev_gestion_immo.controller;

import com.example.pidev_gestion_immo.entities.Profil;
import com.example.pidev_gestion_immo.services.IProfilService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/profil")
public class ProfilController {
    IProfilService profilService;
    @GetMapping("/afficherProfils")
    List<Profil> retrieveAllProfils(){
        return profilService.retrieveAllProfils();
    }

    @PostMapping("/ajouterProfil")
    Profil addProfil(@RequestBody Profil e){
        return  profilService.addProfil(e);
    }

    @PutMapping("/modifierProfil")
    Profil modiferProfil (@RequestBody Profil e){
        e.setAncienPassword(e.getNewPassword());
        return profilService.updateProfil(e);
    }

    @GetMapping("/afficherProfil/{idProfil}")
    Profil retrieveProfil (@PathVariable Integer idProfil){
        return profilService.retrieveProfil(idProfil);
    }
    @GetMapping("/getProfilByEmail/{email}")
    Profil getProfilByEmail (@PathVariable String email){
        return profilService.getProfilByEmail(email);
    }

    @PostMapping("/ArchiverProfil/{idProfil}")
    void deleteProfil(@PathVariable Integer idProfil){
        profilService.archiveProfil(idProfil);
    }

    @PostMapping("/send-email")
    public void sendEmail(@RequestBody Profil e) {
        profilService.sendNewPasswordEmail(e);
    }


}
