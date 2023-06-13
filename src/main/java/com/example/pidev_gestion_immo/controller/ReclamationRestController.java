package com.example.pidev_gestion_immo.controller;
import com.example.pidev_gestion_immo.entities.Contrat;
import com.example.pidev_gestion_immo.entities.Reclamation;
import com.example.pidev_gestion_immo.service.ContratService;
import com.example.pidev_gestion_immo.service.ReclamationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/reclamation")
public class ReclamationRestController {

  ReclamationService reclamationService;
    ContratService contratService;

    @PostMapping("add-reclamation")
    public void ajouterRecclamation(@RequestBody Reclamation reclamation) {
        reclamationService.ajouterreclamation(reclamation);
    }


  @DeleteMapping("/remove-reclamation/{reclamation-id}")
  public void removeReclamation(@PathVariable("reclamation-id") Integer reclamationId) {
    reclamationService.deleteReclamation(reclamationId);
  }

  @PutMapping("/modify-reclamation")
  public Reclamation modifyReclamation(@RequestBody Reclamation reclamation) {
    return reclamationService.updatereclamation(reclamation);
  }
}
