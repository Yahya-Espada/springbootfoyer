package com.example.firstproject.services;


import com.example.firstproject.Entity.Universite;


import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);

    Universite getUniversiteById(long idUniversite);

    Universite updateUniversite(Universite universite);

    void deleteUniversite(Universite universite);

    List<Universite> getAllUniversite();
}
