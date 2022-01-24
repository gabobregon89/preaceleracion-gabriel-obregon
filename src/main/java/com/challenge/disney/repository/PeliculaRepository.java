package com.challenge.disney.repository;

import com.challenge.disney.entity.PeliculaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long> {
    
}
