package com.example.firstproject.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne(cascade = CascadeType.ALL)
    private Foyer foyes;

}
