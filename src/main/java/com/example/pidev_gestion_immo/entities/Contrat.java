package com.example.pidev_gestion_immo.entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contrat implements Serializable{
    @Id
    Integer idContrat;
    String  titre;
    String  description;

    @ManyToOne
    Utilisateur utilisateur;

    @OneToOne
    BienImmobiliere bienImmobiliere;
}
