package com.challenge.disney.mapper;

import java.util.*;

import com.challenge.disney.dto.PersonajeDto;
import com.challenge.disney.entity.PersonajeEntity;

import org.springframework.stereotype.Component;

@Component
public class PersonajeMapper {

    public PersonajeEntity personajeDto2Entity(PersonajeDto dto) {
        PersonajeEntity entity = new PersonajeEntity();
        entity.setImagen(dto.getImagen());
        entity.setNombre(dto.getNombre());
        entity.setEdad(dto.getEdad());
        entity.setPeso(dto.getPeso());
        entity.setHistoria(dto.getHistoria());
        return entity;
    }
    
    public PersonajeDto personajeEntity2Dto(PersonajeEntity entity) {
        PersonajeDto dto = new PersonajeDto();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        dto.setEdad(entity.getEdad());
        dto.setPeso(entity.getPeso());
        dto.setHistoria(entity.getHistoria());
        return dto;
    }

    public List<PersonajeDto> personajeEntityList2DtoList(List<PersonajeEntity> entities) {
        List<PersonajeDto> dtos = new ArrayList<>();
        for (PersonajeEntity entity : entities) {
            dtos.add(personajeEntity2Dto(entity));
        }
        return dtos;
    }
}
