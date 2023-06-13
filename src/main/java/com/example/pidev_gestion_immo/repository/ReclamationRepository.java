package com.example.pidev_gestion_immo.repository;

import com.example.pidev_gestion_immo.entities.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReclamationRepository  extends JpaRepository<Reclamation,Integer> {
}
