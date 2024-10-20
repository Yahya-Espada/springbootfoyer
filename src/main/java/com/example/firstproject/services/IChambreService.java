package com.example.firstproject.services;

import com.example.firstproject.Entity.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);

    List<Chambre> getAllChambre();

    Chambre updateChambre(Chambre chambre);

    void deleteChambre(Chambre chambre);

    Chambre getChambreByid(Long id);
}