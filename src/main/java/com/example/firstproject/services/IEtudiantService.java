package com.example.firstproject.services;





import com.example.firstproject.Entity.Etudiant;

import java.util.List;


public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);

    Etudiant getEtudiantById(long idEtudiant);

    Etudiant updateEtudiant(Etudiant etudiant);

    void deleteEtudiant(Etudiant etudiant);

    List<Etudiant> getAllEtudiant();
}
