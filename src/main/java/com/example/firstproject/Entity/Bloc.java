package com.example.firstproject.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Bloc {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private long idBloc;
private String nomBloc;
private long capaciteBloc;

@ManyToOne(cascade = CascadeType.ALL)
    Foyer foyes;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "blocs")
    private Set<Chambre> chambres;




}
