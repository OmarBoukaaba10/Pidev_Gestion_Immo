package com.example.pidev_gestion_immo.controller;

import com.example.pidev_gestion_immo.entities.Profil;
import com.example.pidev_gestion_immo.services.IProfilService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
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
        return profilService.updateProfil(e);
    }

    @GetMapping("/afficherProfil/{idProfil}")
    Profil retrieveProfil (@PathVariable Integer idProfil){
        return profilService.retrieveProfil(idProfil);
    }

    @PostMapping("/ArchiverProfil/{idProfil}")
    void deleteProfil(@PathVariable Integer idProfil){
        profilService.archiveProfil(idProfil);
    }




}
