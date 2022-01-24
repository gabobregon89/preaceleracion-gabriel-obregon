package com.challenge.disney.controller;

import java.util.List;

import com.challenge.disney.dto.PersonajeDto;
import com.challenge.disney.service.PersonajeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personajes")
public class PersonajeController {
    
    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    public ResponseEntity<PersonajeDto> save(@RequestBody PersonajeDto dto) {
        PersonajeDto personaje = personajeService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaje);
    }

    @GetMapping
    public ResponseEntity<List<PersonajeDto>> getAll() {
        List<PersonajeDto> personajes = personajeService.getAllPersonajes();
        return ResponseEntity.ok().body(personajes);
    }

}
