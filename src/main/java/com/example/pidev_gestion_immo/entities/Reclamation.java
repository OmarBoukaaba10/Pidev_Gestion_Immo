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
public class Reclamation implements Serializable{

    @Id
    Integer idReclamation;
    String  status;
    String  description;
    @Enumerated(EnumType.STRING)
    Typereclamation typereclamation;

    @ManyToOne
    Utilisateur utilisateur;
}
