package com.example.firstproject.repositories;

import com.example.firstproject.Entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
