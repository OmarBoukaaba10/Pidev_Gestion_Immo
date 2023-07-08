package com.example.pidev_gestion_immo.controller;

import com.example.pidev_gestion_immo.entities.Profil;
import com.example.pidev_gestion_immo.entities.Utilisateur;
import com.example.pidev_gestion_immo.services.IUtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UtilisateurController {
    IUtilisateurService utilisateurService;

    @GetMapping("/afficherUsers")
    List<Utilisateur> retrieveAllUsers(){
        return utilisateurService.retrieveAllUsers();
    }

    @PostMapping("/ajouterUser")
    Utilisateur addUser(@RequestBody Utilisateur e){
        return  utilisateurService.addUser(e);
    }

    @PutMapping("/modifierUser")
    Utilisateur modiferUser (@RequestBody Utilisateur e){
        return utilisateurService.updateUser(e);
    }

    @GetMapping("/afficherUser/{idUser}")
    Utilisateur retrieveUser (@PathVariable Integer idUser){
        return utilisateurService.retrieveUser(idUser);
    }

    @PostMapping("/ArchiverUser/{idUser}")
    void deleteUser(@PathVariable Integer idUser){
        utilisateurService.archiveUser(idUser);
    }

    @PostMapping("/ActiverUser/{idUser}")
    void activerUser(@PathVariable Integer idUser){
        utilisateurService.activerUser(idUser);
    }


}
