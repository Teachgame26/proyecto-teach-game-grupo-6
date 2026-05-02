package com.grupo6.config;

import com.grupo6.model.entity.Usuario;
import com.grupo6.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(UsuarioRepository repository) {
        return args -> {

            List<Usuario> usuarios = List.of(

                // Profesores
                crear("Carlos Pérez", "carlos@uni.com", Usuario.Rol.PROFESOR),
                crear("Ana Gómez", "ana@uni.com", Usuario.Rol.PROFESOR),

                // Estudiantes
                crear("Juan López", "juan@uni.com", Usuario.Rol.ESTUDIANTE),
                crear("María Torres", "maria@uni.com", Usuario.Rol.ESTUDIANTE),
                crear("Luis Ramírez", "luis@uni.com", Usuario.Rol.ESTUDIANTE),
                crear("Sofía Herrera", "sofia@uni.com", Usuario.Rol.ESTUDIANTE),
                crear("Pedro Castillo", "pedro@uni.com", Usuario.Rol.ESTUDIANTE)
            );

            repository.saveAll(usuarios);
        };
    }

    private Usuario crear(String nombre, String email, Usuario.Rol rol) {
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setEmail(email);
        u.setPassword("1234"); // simple para pruebas
        u.setRol(rol);
        return u;
    }
}
