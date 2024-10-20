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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "foyes")
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyes")
    private Set<Bloc> blocs ;
}
