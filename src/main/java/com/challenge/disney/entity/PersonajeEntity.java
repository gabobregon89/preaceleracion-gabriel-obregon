package com.challenge.disney.entity;

import javax.persistence.*;

import lombok.NonNull;

public class PersonajeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    
    @NonNull
    private String nombre;
    
    private Long edad;
    
    private Long peso;
    
    private String historia;
}
