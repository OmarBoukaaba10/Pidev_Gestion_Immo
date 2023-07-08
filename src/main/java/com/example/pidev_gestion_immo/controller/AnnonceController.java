package com.example.pidev_gestion_immo.controller;

import com.example.pidev_gestion_immo.entities.Annonce;
import com.example.pidev_gestion_immo.services.IAnnonceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
//@RequestMapping(path = "http://localhost:4200")
public class AnnonceController {

@Autowired
    IAnnonceService iAnnonceService;

    @GetMapping("/afficherAnnonces")
    List<Annonce> retrieveAllAnnonces() {
        return iAnnonceService.retrieveAllAnnonces();
    }

    @PostMapping("/ajouterAnnonce")
    Annonce addAnnonce(@RequestBody Annonce e) {
        return iAnnonceService.addAnnonce(e);
    }

    @PutMapping("/modifierAnnonce/")
    Annonce modiferAnnonce( @RequestBody Annonce e) {
        return iAnnonceService.updateAnnonce(e);
    }

    @GetMapping("/afficherAnnonce/{idAnnonce}")
    Annonce retrieveAnnonce(@PathVariable Integer idAnnonce) {

        return iAnnonceService.retrieveAnnonce(idAnnonce);
    }

    @DeleteMapping("/deleteAnnonce/{idAnnonce}")
    void deleteAnnonce(@PathVariable Integer idAnnonce) {
        iAnnonceService.archiveAnnonce(idAnnonce);
    }
    @PutMapping("/assignBienimmotToannonce/{idBienimmo}/{src}")
    public void assignBienImmoToannonce(@PathVariable Integer idBienimmo,@PathVariable Integer src) {
        iAnnonceService.assignBienImmotToAnnonce(idBienimmo,src);
    }
    @PutMapping("/assignPromotiontoToannonce/{idPromo}/{idAnnonce}")
    public void PromotiontoToannonce(@PathVariable Integer idPromo,@PathVariable Integer idAnnonce) {
        iAnnonceService.assignPromotionToAnnonce(idPromo,idAnnonce);

    }
    @PutMapping("/assignPromotiontoToannonce/{id}/{idAnnonce}")
    public void assignImagetoToannonce(@PathVariable Integer id,@PathVariable Integer src) {
        iAnnonceService.assignPromotionToAnnonce(id,src);
    }

}
