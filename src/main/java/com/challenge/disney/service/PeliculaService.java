package com.challenge.disney.service;

import java.util.List;

import com.challenge.disney.dto.PeliculaDto;

public interface PeliculaService {
    
    public PeliculaDto save(PeliculaDto dto);

    public List<PeliculaDto> getAllPeliculas();

}
