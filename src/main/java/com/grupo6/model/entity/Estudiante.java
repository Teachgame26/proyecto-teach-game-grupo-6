package com.grupo6.model.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @JsonBackReference
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @ManyToMany(mappedBy = "estudiantes")
private List<Materia> materias;

    @SuppressWarnings("unused")
    private String nombre;
    @SuppressWarnings("unused")
    private String email;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    public void setProfesor(Profesor profesor2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setProfesor'");
    }

    public void setEmail(String email2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    }

    public void setNombre(String nombre2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }

    // Getters y Setters
}
