package com.challenge.disney.controller;

import java.util.List;

import com.challenge.disney.dto.PeliculaDto;
import com.challenge.disney.service.PeliculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("peliculas")
public class PeliculaController {
    
    @Autowired
    private PeliculaService peliculaService;

    @PostMapping
    public ResponseEntity<PeliculaDto> save(@RequestBody PeliculaDto dto) {
        PeliculaDto pelicula = peliculaService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(pelicula);
    }

    @GetMapping
    public ResponseEntity<List<PeliculaDto>> getAllPeliculas() {
        List<PeliculaDto> peliculas = peliculaService.getAllPeliculas();
        return ResponseEntity.ok().body(peliculas);
    }
}
