package com.example.firstproject.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;
    private long numeroChambre;

    @ManyToOne(cascade = CascadeType.ALL)
    Bloc blocs;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
