package com.challenge.disney.entity;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.NonNull;

public class PeliculaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    
    @NonNull
    private String titulo;
    
    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaCreacion;
    
    private Long calificacion;    

}
