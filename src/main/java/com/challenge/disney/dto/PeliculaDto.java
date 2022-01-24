package com.challenge.disney.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Getter
@Setter

public class PeliculaDto {
    private Long id;
    private String imagen;
    private String titulo;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaCreacion;
    private Long calificacion;
    private Long generoId;
}

