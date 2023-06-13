package com.example.pidev_gestion_immo.service;

import com.example.pidev_gestion_immo.entities.Contrat;
import com.example.pidev_gestion_immo.entities.Reclamation;
import com.example.pidev_gestion_immo.repository.ReclamationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j

public class ReclamationService {

    ReclamationRepository reclamationRepository;
    public void ajouterreclamation(Reclamation reclamation)
    {
        reclamationRepository.save(reclamation);
    }

    public void deleteReclamation(Integer id) {
        reclamationRepository.deleteById(id);

    }
    public Reclamation updatereclamation(Reclamation r) {
        reclamationRepository.save(r);
        return r;
    }
}
