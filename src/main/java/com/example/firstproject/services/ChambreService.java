package com.example.firstproject.services;

import com.example.firstproject.Entity.Chambre;
import com.example.firstproject.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{
private ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Chambre chambre) {
       chambreRepository.delete(chambre);
    }


    @Override
    public Chambre getChambreByid(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }
}
