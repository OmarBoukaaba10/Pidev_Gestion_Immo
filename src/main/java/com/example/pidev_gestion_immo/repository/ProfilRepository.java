package com.example.pidev_gestion_immo.repository;

import com.example.pidev_gestion_immo.entities.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfilRepository extends JpaRepository<Profil,Integer> {
    @Query("select e from Profil e where e.email=?1")
    Profil getProfilByEmail(String email);
}
