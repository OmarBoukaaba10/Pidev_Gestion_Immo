package com.example.pidev_gestion_immo.repository;

import com.example.pidev_gestion_immo.entities.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository extends JpaRepository<Annonce, Integer> {
    Annonce findBySrc (Integer src);
}
