package com.challenge.disney.service;

import java.util.List;

import com.challenge.disney.dto.PersonajeDto;

public interface PersonajeService {
    
    public PersonajeDto save(PersonajeDto dto);

    public List<PersonajeDto> getAllPersonajes();
}
