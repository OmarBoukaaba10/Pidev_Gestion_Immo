package com.example.pidev_gestion_immo.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Promotion implements Serializable {
    @Id
    Integer idPromo;

    @Temporal(TemporalType.DATE)
    Date dateDebut;

    @Temporal(TemporalType.DATE)
    Date dateFin;

    @OneToMany(mappedBy = "promotion")
    Set<Annonce> annonces;


}