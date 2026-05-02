package com.grupo6.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @JsonBackReference
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
    private String nombre;
    @SuppressWarnings("unused")
    private String email;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    // Getters y Setters
}
