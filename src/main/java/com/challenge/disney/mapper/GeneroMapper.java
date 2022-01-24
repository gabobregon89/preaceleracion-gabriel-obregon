package com.challenge.disney.mapper;

import java.util.ArrayList;
import java.util.List;

import com.challenge.disney.dto.GeneroDto;
import com.challenge.disney.entity.GeneroEntity;

import org.springframework.stereotype.Component;

@Component
public class GeneroMapper {
    
    public GeneroEntity generoDto2Entity(GeneroDto dto) {
        GeneroEntity entity = new GeneroEntity();
        entity.setImagen(dto.getImagen());
        entity.setNombre(dto.getNombre());
        return entity;
    }

    public GeneroDto generoEntity2Dto(GeneroEntity entity) {
        GeneroDto dto = new GeneroDto();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        return dto;
    }

    public List<GeneroDto> generoEntityList2DtoList(List<GeneroEntity> entities) {
        List<GeneroDto> dtos = new ArrayList<>();
        for(GeneroEntity entity : entities) {
            dtos.add(generoEntity2Dto(entity));
        }
        return dtos;
    }
}
