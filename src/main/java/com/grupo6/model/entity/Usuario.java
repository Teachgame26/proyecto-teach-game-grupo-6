package com.grupo6.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    public enum Rol {
        ESTUDIANTE,
        PROFESOR
    }

    // Getters y Setters
}
