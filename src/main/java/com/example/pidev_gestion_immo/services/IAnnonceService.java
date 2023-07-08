package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Annonce;

import java.util.List;

public interface IAnnonceService {
    List<Annonce> retrieveAllAnnonces();

    Annonce addAnnonce(Annonce e);

    Annonce updateAnnonce(Annonce e);

    Annonce retrieveAnnonce(Integer idAnnonce);

    void archiveAnnonce(Integer idAnnonce);
   void assignBienImmotToAnnonce (Integer idBienimmo, Integer src) ;
    void assignPromotionToAnnonce (Integer idPromo, Integer idAnnonce) ;
    Annonce findBySrc (Integer src);

    void assignImageToAnnonce(Integer id, Integer src);
}
