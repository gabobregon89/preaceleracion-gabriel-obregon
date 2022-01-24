package com.challenge.disney.mapper;

import java.util.ArrayList;
import java.util.List;

import com.challenge.disney.dto.PeliculaDto;
import com.challenge.disney.entity.PeliculaEntity;

import org.springframework.stereotype.Component;

@Component
public class PeliculaMapper {
    
    public PeliculaEntity peliculaDto2Entity(PeliculaDto dto) {
        PeliculaEntity entity = new PeliculaEntity();
        entity.setImagen(dto.getImagen());
        entity.setTitulo(dto.getTitulo());
        entity.setFechaCreacion(dto.getFechaCreacion());
        entity.setCalificacion(dto.getCalificacion());
        entity.setGeneroId(dto.getGeneroId());
        return entity;
    }

    public PeliculaDto peliculaEntity2Dto(PeliculaEntity entity) {
        PeliculaDto dto = new PeliculaDto();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setTitulo(entity.getTitulo());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setCalificacion(entity.getCalificacion());
        dto.setGeneroId(entity.getGeneroId());
        return dto;
    }

    public List<PeliculaDto> peliculaEntityList2DtoList(List<PeliculaEntity> entities) {
        List<PeliculaDto> dtos = new ArrayList<>();
        for(PeliculaEntity entity : entities) {
            dtos.add(peliculaEntity2Dto(entity));
        }
        return dtos;
    }
}
