package com.example.pidev_gestion_immo.controller;

import com.example.pidev_gestion_immo.entities.BienImmobiliere;
import com.example.pidev_gestion_immo.services.IBienImmobiliereService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BienImmobiliereController {
@Autowired

    IBienImmobiliereService iBienImmobiliereService;

    @GetMapping("/afficherBienImmobiliere")
    List<BienImmobiliere> retrieveAllBienImmobilieres() {
        return iBienImmobiliereService.retrieveAllBienImmobilieres();
    }

    @PostMapping("/ajouterBienImmobiliere")
    BienImmobiliere addBienImmobiliere(@RequestBody BienImmobiliere e) {
        return iBienImmobiliereService.addBienImmobiliere(e);
    }

    @PutMapping("/modifierBienImmobiliere")
    BienImmobiliere modiferBienImmobiliere(@RequestBody BienImmobiliere e) {
        return iBienImmobiliereService.updateBienImmobiliere(e);
    }

    @GetMapping("/afficherUser/{idBienImmobiliere}")
    BienImmobiliere retrieveBienImmobiliere(@PathVariable Integer idBienImmobiliere) {
        return iBienImmobiliereService.retrieveBienImmobiliere(idBienImmobiliere);
    }

    @PostMapping("/ArchiverBienImmobiliere/{idBienImmobiliere}")
    void deleteBienImmobiliere(@PathVariable Integer idBienImmobiliere) {
        iBienImmobiliereService.archiveBienImmobiliere(idBienImmobiliere);
    }

}
