package com.example.firstproject.repositories;


import com.example.firstproject.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
