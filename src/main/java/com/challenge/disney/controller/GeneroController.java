package com.challenge.disney.controller;

import java.util.List;

import com.challenge.disney.dto.GeneroDto;
import com.challenge.disney.service.GeneroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("generos")
public class GeneroController {
    
    @Autowired
    private GeneroService generoService;

    @PostMapping
    public ResponseEntity<GeneroDto> save(@RequestBody GeneroDto genero) {
        GeneroDto generoGuardado = generoService.save(genero);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
    }

    @GetMapping
    public ResponseEntity<List<GeneroDto>> getAll() {
        List<GeneroDto> generosLista = generoService.getAllGeneros();
        return ResponseEntity.ok().body(generosLista);
    }

    



}
