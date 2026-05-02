package com.grupo6.model.entity;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

@Table(name = "profesores")
public class Profesor {

    @JsonManagedReference
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @SuppressWarnings("unused")
    private String nombre;
    @SuppressWarnings("unused")
    private String email;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Estudiante> estudiantes;

    public List<Estudiante> getEstudiantes() {
        // TODO Auto-generated method stub
        
        throw new UnsupportedOperationException("Unimplemented method 'getEstudiantes'");
    }

    // Getters y Setters
}
