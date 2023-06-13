package com.example.pidev_gestion_immo.controller;
import com.example.pidev_gestion_immo.entities.Contrat;
import com.example.pidev_gestion_immo.service.ContratService;
import com.example.pidev_gestion_immo.service.ReclamationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    ContratService contratService;
    ReclamationService reclamationService;

    @PostMapping("add-contrat")
    public void ajouterContrat(@RequestBody Contrat contrat) {
        contratService.ajoutercontrat(contrat);
    }

    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeContrat(@PathVariable("contrat-id") Integer contratId) {
        contratService.deleteContrat(contratId);
    }

    @PutMapping("/modify-contrat")
    public Contrat modifyContrat(@RequestBody Contrat contrat) {
        return contratService.updatecontrat(contrat);
    }


    @GetMapping("/retrieve-contrat/{contrat-id}")

    public Contrat retrieveContrat(@PathVariable("contrat-id") Integer contratId) {
        return contratService.retrieveContrat(contratId);
    }
}
