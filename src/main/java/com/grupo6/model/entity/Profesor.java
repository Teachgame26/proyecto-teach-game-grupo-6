package com.grupo6.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// import com.fasterxml.jackson.annotation.JsonBackReference;
// import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "profesores")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Profesor {

    // @JsonBackReference
    // @JsonManagedReference
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    // @SuppressWarnings("unused")
    @Column
    private String nombre;
    // @SuppressWarnings("unused")
    @Column
    private String email;

    @ManyToMany(mappedBy = "profesores")
    private List<Materia> materias;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Estudiante> estudiantes;

    // public List<Estudiante> getEstudiantes() {
    //     // TODO Auto-generated method stub
        
    //     throw new UnsupportedOperationException("Unimplemented method 'getEstudiantes'");
    // }

    // public void setNombre(String string) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    // }

    // public void setEmail(String string) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    // }

    // public void setMaterias(List<Materia> of) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setMaterias'");
    // }

    // // Getters y Setters
}
