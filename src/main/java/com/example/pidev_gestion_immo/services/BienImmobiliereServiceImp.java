package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.BienImmobiliere;
import com.example.pidev_gestion_immo.repository.BienImmobiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class BienImmobiliereServiceImp implements IBienImmobiliereService {
    @Autowired
    BienImmobiliereRepository bienImmobiliereRepository;

    @Override
    public List<BienImmobiliere> retrieveAllBienImmobilieres() {
        return bienImmobiliereRepository.findAll();
    }

    @Override
    public BienImmobiliere addBienImmobiliere(BienImmobiliere e) {
        return bienImmobiliereRepository.save(e);
    }

    @Override
    public BienImmobiliere updateBienImmobiliere(BienImmobiliere e) {
        return bienImmobiliereRepository.save(e);
    }

    @Override
    public BienImmobiliere retrieveBienImmobiliere(Integer idBienImmobiliere) {
        return bienImmobiliereRepository.findById(idBienImmobiliere).orElse(null);
    }

    @Override
    public void archiveBienImmobiliere(Integer idBienImmobiliere) {
        bienImmobiliereRepository.deleteById(idBienImmobiliere);

    }
}
