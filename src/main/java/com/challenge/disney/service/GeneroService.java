package com.challenge.disney.service;

import java.util.List;

import com.challenge.disney.dto.GeneroDto;

public interface GeneroService {
    
    public GeneroDto save(GeneroDto genero);

    public List<GeneroDto> getAllGeneros();
}
