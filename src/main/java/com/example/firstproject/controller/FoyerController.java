package com.example.firstproject.controller;


import com.example.firstproject.Entity.Foyer;
import com.example.firstproject.services.IFoyerService;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j

@RequestMapping("api/foyers")
public class FoyerController {
    IFoyerService foyerService;
    @PostMapping("addfoyer")
    public Foyer ajoutFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @GetMapping("getfoyer/{idFoyer}")
    public Foyer getFoyer(@PathVariable("idFoyer") long idFoyer) {
        return foyerService.getFoyerById(idFoyer);
    }

    @DeleteMapping("deletefoyer")
    public void deleteFoyer(@RequestBody Foyer foyer) {
        foyerService.deleteFoyer(foyer);
    }

    @PutMapping("updatefoyer")
    public Foyer modifierFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @GetMapping("getallfoyer")
    public List<Foyer> getAllFoyer() {
        return foyerService.getAllFoyer();
    }
}
