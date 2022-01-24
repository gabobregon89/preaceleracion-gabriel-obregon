package com.challenge.disney.entity;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Getter
@Setter

@Entity
public class PeliculaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    
    @NonNull
    private String titulo;
    
    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaCreacion;

    private Long calificacion;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false,updatable = false)
    private GeneroEntity genero;

    @Column(name = "genero_id", nullable = false)
    private Long generoId;

    @ManyToMany(
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    @JoinTable(
        name = "personajes_peli",
        joinColumns = @JoinColumn(name = "peli_id"),
        inverseJoinColumns = @JoinColumn(name = "personaje_id") 
        )
    private List<PersonajeEntity> personajes = new ArrayList<>();

}
