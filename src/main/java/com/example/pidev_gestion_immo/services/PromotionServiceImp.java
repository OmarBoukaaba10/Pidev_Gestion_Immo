package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Annonce;
import com.example.pidev_gestion_immo.entities.BienImmobiliere;
import com.example.pidev_gestion_immo.entities.Promotion;
import com.example.pidev_gestion_immo.repository.AnnonceRepository;
import com.example.pidev_gestion_immo.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PromotionServiceImp implements IPromotionService {
    @Autowired
    PromotionRepository promotionRepository;
    AnnonceRepository annonceRepository;

    @Override
    public List<Promotion> retrieveAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion addPromotion(Promotion e) {
        return promotionRepository.save(e);
    }

    @Override
    public Promotion updatePromotion(Promotion e) {
        return promotionRepository.save(e);
    }

    @Override
    public Promotion retrievePromotion(Integer idPromotion) {
        return promotionRepository.findById(idPromotion).orElse(null);
    }

    @Override
    public void archivePromotion(Integer idPromotion) {
        promotionRepository.deleteById(idPromotion);


    }

    @Override
    public void assignAnnoncetToPromotion(Integer idPromotion, Integer idAnnonce) {
  /*      Annonce annonce = annonceRepository.findById(idAnnonce).orElse(null);
        Promotion promotion = promotionRepository.findById(idPromotion).orElse(null);
        annonce;
        annonceRepository.save(annonce);*/
    }

}
