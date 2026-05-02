package com.grupo6.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @SuppressWarnings("unused")
    @Column
    private String nombre;
    // @SuppressWarnings("unused")
    @Column
    private String email;
    // @SuppressWarnings("unused")
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    public enum Rol {
        ESTUDIANTE,
        PROFESOR
    }

    // public void setNombre(String nombre2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    // }

    // public void setEmail(String email2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    // }

    // public void setPassword(String string) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setPassword'");
    // }

    // public void setRol(Rol rol2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'setRol'");
    // }

    // Getters y Setters
}
