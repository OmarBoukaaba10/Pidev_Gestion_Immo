package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Annonce;
import com.example.pidev_gestion_immo.entities.BienImmobiliere;
import com.example.pidev_gestion_immo.entities.Image;
import com.example.pidev_gestion_immo.entities.Promotion;
import com.example.pidev_gestion_immo.repository.AnnonceRepository;
import com.example.pidev_gestion_immo.repository.BienImmobiliereRepository;
import com.example.pidev_gestion_immo.repository.ImageRepository;
import com.example.pidev_gestion_immo.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnnonceServiceImp implements IAnnonceService {
    @Autowired
    AnnonceRepository annonceRepository;
    @Autowired
    BienImmobiliereRepository bienImmobiliereRepository;
    @Autowired
    PromotionRepository promotionRepository;
    @Autowired
    ImageRepository imageRepository;

    @Override
    public List<Annonce> retrieveAllAnnonces() {
        return annonceRepository.findAll();
    }

    @Override
    public Annonce addAnnonce(Annonce e) {
        return annonceRepository.save(e);
    }

    @Override
    public Annonce updateAnnonce( Annonce e) {
        return annonceRepository.save(e);
    }

    @Override
    public Annonce retrieveAnnonce(Integer idAnnonce) {

        return annonceRepository.findById(idAnnonce).orElse(null);
    }

    @Override
    public void archiveAnnonce(Integer idAnnonce) {
         annonceRepository.deleteById(idAnnonce);

    }
    public Annonce findBySrc (Integer src){

        Annonce annonce = annonceRepository.findBySrc(src);
        return annonce;
    }
    @Override
    public void assignBienImmotToAnnonce(Integer idBienimmo, Integer src) {
        Annonce annonce = annonceRepository.findBySrc(src);
        BienImmobiliere bienImmobiliere = bienImmobiliereRepository.findById(idBienimmo).orElse(null);
        annonce.setBienImmobiliere(bienImmobiliere);
        annonceRepository.save(annonce);
    }

    @Override
    public void assignPromotionToAnnonce(Integer idPromo, Integer idAnnonce) {
        Annonce annonce = annonceRepository.findById(idAnnonce).orElse(null);
        Promotion promotion = promotionRepository.findById(idPromo).orElse(null);
        assert annonce != null;
        annonce.setPromotion(promotion);
        annonceRepository.save(annonce);
    }

    @Override
    public void assignImageToAnnonce(Integer id, Integer src) {
        Annonce annonce = annonceRepository.findBySrc(src);
        Image image = imageRepository.findById(id).orElse(null);
        annonce.setImage(image);
        annonceRepository.save(annonce);
    }
}
