package com.example.pidev_gestion_immo.repository;

import com.example.pidev_gestion_immo.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
