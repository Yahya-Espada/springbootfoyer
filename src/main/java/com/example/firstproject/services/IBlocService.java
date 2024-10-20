package com.example.firstproject.services;




import com.example.firstproject.Entity.Bloc;


import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);

    Bloc getBlocById(long idBloc);

    Bloc updateBloc(Bloc bloc);

    void deleteBloc(Bloc bloc);

    List<Bloc> getAllBloc();

}



