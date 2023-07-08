package com.example.pidev_gestion_immo.repository;
import  com.example.pidev_gestion_immo.entities.Image;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Integer> {
	Optional<Image> findByName(String name);
}
