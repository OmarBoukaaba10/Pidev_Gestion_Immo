package com.example.pidev_gestion_immo.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idRole;

    String name;

    @ManyToMany(mappedBy = "roles")
    Set<Utilisateur> utilisateurs;
}
