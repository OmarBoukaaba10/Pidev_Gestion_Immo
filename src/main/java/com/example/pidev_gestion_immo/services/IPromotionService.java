package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Promotion;

import java.util.List;

public interface IPromotionService {
    List<Promotion> retrieveAllPromotions();

    Promotion addPromotion(Promotion e);

    Promotion updatePromotion(Promotion e);

    Promotion retrievePromotion(Integer idPromotion);

    void archivePromotion(Integer idPromotion);
    void assignAnnoncetToPromotion (Integer idPromotion, Integer idAnnonce) ;

}
