package com.challenge.disney.entity;

import javax.persistence.*;
import lombok.NonNull;


public class GeneroEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    private String nombre;
    
    private String imagen;
}
