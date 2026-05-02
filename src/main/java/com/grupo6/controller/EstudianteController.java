package com.grupo6.controller;

import com.grupo6.model.entity.Estudiante;
import com.grupo6.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    // 📌 Listar todos
    @GetMapping
    public List<Estudiante> listar() {
        return service.obtenerTodos();
    }

    // 📌 Crear estudiante
    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return service.guardar(estudiante);
    }
}
