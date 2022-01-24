package com.challenge.disney.dto;

import lombok.*;

@Getter
@Setter

public class PersonajeDto {
    private Long id;
    private String imagen;
    private String nombre;  
    private Long edad;
    private Long peso;
    private String historia;
}
