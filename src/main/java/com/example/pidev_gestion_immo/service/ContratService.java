package com.example.pidev_gestion_immo.service;

import com.example.pidev_gestion_immo.repository.ContratRepository;
import com.example.pidev_gestion_immo.repository.ReclamationRepository;

import com.example.pidev_gestion_immo.entities.Contrat;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
@Slf4j

public class ContratService {

    ContratRepository contratRepository;

    public void ajoutercontrat(Contrat contrat) {contratRepository.save(contrat);
    }

    private void save(Contrat contrat) {
    }


    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);

    }

    public Contrat updatecontrat(Contrat c) {
        contratRepository.save(c);
        return c;
    }

    public Contrat retrieveContrat(Integer id) {
        Contrat c= contratRepository.findById(id).get();
        return c;
    }

}
