package com.challenge.disney.service.impl;

import java.util.List;

import com.challenge.disney.dto.PeliculaDto;
import com.challenge.disney.entity.PeliculaEntity;
import com.challenge.disney.mapper.PeliculaMapper;
import com.challenge.disney.repository.PeliculaRepository;
import com.challenge.disney.service.PeliculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    
    @Autowired
    private PeliculaMapper peliculaMapper;

    @Autowired
    private PeliculaRepository peliculaRepository; 

    public PeliculaDto save(PeliculaDto dto) {
        PeliculaEntity entity = peliculaMapper.peliculaDto2Entity(dto);
        PeliculaEntity entitySaved = peliculaRepository.save(entity);
        PeliculaDto result = peliculaMapper.peliculaEntity2Dto(entitySaved);
        return result;
    }

    public List<PeliculaDto> getAllPeliculas() {
        List<PeliculaEntity> entities = peliculaRepository.findAll();
        List<PeliculaDto> dtos = peliculaMapper.peliculaEntityList2DtoList(entities);
        return dtos;
    }
}
