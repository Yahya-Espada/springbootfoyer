package com.example.firstproject.controller;

import com.example.firstproject.Entity.Chambre;
import com.example.firstproject.services.IChambreService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("api/chambres")

public class ChambreController {
    IChambreService chambreService;
    @PostMapping("add")
    public Chambre addChambre(@RequestBody Chambre chambre){
        return  chambreService.addChambre(chambre);

    }
   @GetMapping("getbyid/{idChambre}")
    public Chambre getChambre(@PathVariable("idChambre") Long idchambre ){
        return  chambreService.getChambreByid(idchambre);

    }

    @DeleteMapping("delete")
    public void deleteChambre(@RequestBody Chambre chambre){
          chambreService.deleteChambre(chambre);

    }
    @PutMapping("updatechambre")
    public Chambre modifierChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @GetMapping("getallchambre")
        public List<Chambre> Allchambre(){
        List<Chambre> listchambres = chambreService.getAllChambre();
        return listchambres;
        }


}
