package com.challenge.disney.service.impl;

import java.util.List;

import com.challenge.disney.dto.GeneroDto;
import com.challenge.disney.entity.GeneroEntity;
import com.challenge.disney.mapper.GeneroMapper;
import com.challenge.disney.repository.GeneroRepository;
import com.challenge.disney.service.GeneroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;

    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDto save(GeneroDto dto) {
        GeneroEntity entity = generoMapper.generoDto2Entity(dto);
        GeneroEntity entitySaved = generoRepository.save(entity);
        GeneroDto result = generoMapper.generoEntity2Dto(entitySaved);
        return result;
    }

    public List<GeneroDto> getAllGeneros() {
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDto> dtos = generoMapper.generoEntityList2DtoList(entities);
        return dtos;
    }
}
