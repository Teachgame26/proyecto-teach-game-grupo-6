package com.grupo6.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "materias")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Materia {

    // @JsonManagedReference
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @SuppressWarnings("unused")
    private String nombre;

    @ManyToMany
    @JoinTable(
        name = "materia_profesor",
        joinColumns = @JoinColumn(name = "materia_id"),
        inverseJoinColumns = @JoinColumn(name = "profesor_id")
    )
    private List<Profesor> profesores;

    @ManyToMany
    @JoinTable(
        name = "materia_estudiante",
        joinColumns = @JoinColumn(name = "materia_id"),
        inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    private List<Estudiante> estudiantes;

    // public void setNombre(String nombre2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    // }

    // Getters y Setters
}
