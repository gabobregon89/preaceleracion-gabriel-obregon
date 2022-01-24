package com.challenge.disney.service.impl;

import java.util.List;

import com.challenge.disney.dto.PersonajeDto;
import com.challenge.disney.entity.PersonajeEntity;
import com.challenge.disney.mapper.PersonajeMapper;
import com.challenge.disney.repository.PersonajeRepository;
import com.challenge.disney.service.PersonajeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImpl implements PersonajeService {
    
    @Autowired
    private PersonajeMapper personajeMapper;

    @Autowired
    private PersonajeRepository personajeRepository;

    public PersonajeDto save(PersonajeDto dto) {
        PersonajeEntity entity = personajeMapper.personajeDto2Entity(dto);
        PersonajeEntity entitySaved = personajeRepository.save(entity);
        PersonajeDto result = personajeMapper.personajeEntity2Dto(entitySaved);
        return result;
    }

    public List<PersonajeDto> getAllPersonajes() {
        List<PersonajeEntity> entities = personajeRepository.findAll();
        List<PersonajeDto> dtos = personajeMapper.personajeEntityList2DtoList(entities);
        return dtos;
    }
}
