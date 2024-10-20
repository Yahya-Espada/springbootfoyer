package com.example.firstproject.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreservation;
    private Date anneeUniversitaire;
    private Boolean isValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants ;

    @ManyToOne(cascade = CascadeType.ALL)
    private Chambre chambre;

}
