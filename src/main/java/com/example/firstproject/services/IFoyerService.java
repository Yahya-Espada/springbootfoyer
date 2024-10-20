package com.example.firstproject.services;




import com.example.firstproject.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);

    Foyer getFoyerById(long idFoyer);

    Foyer updateFoyer(Foyer foyer);

    void deleteFoyer(Foyer foyer);

    List<Foyer> getAllFoyer();
}
