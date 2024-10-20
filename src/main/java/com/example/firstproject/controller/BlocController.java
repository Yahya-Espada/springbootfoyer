package com.example.firstproject.controller;



import com.example.firstproject.Entity.Bloc;

import com.example.firstproject.services.IBlocService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@Slf4j

@RequestMapping("api/blocs")
@Tag(name = "Bloc", description = "Bloc API")
public class BlocController {


    IBlocService blocService;

    @PostMapping("addbloc")
    @Operation(summary = "Ajouter un bloc")
    public Bloc ajoutBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @GetMapping("getbloc/{idBloc}")
    public Bloc getBloc(@PathVariable("idBloc") long idBloc) {
        return blocService.getBlocById(idBloc);
    }

    @DeleteMapping("deletebloc")
    public void deleteBloc(@RequestBody Bloc bloc) {
        blocService.deleteBloc(bloc);
    }

    @PutMapping("updatebloc")
    public Bloc modifierBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping("getallbloc")
    public List<Bloc> getAllBloc() {
        return blocService.getAllBloc();
    }

}

