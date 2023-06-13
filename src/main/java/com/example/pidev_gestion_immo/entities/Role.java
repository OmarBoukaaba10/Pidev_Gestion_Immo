package com.example.pidev_gestion_immo.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
    Integer idRole;

    String name;

    @ManyToMany(mappedBy = "roles")
    Set<Utilisateur> utilisateurs;
}
