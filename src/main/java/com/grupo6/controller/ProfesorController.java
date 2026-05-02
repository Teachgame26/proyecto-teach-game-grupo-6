package com.grupo6.controller;

import com.grupo6.model.entity.Estudiante;
import com.grupo6.model.entity.Profesor;
import com.grupo6.service.ProfesorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")


public class ProfesorController {

    
    private final ProfesorService service;

    public ProfesorController(ProfesorService service) {
        this.service = service;
    }

    // 📌 Obtener todos los profesores
    @GetMapping
    public List<Profesor> listar() {
        return service.obtenerTodos();
    }

    // 📌 Obtener profesor por ID
    @GetMapping("/{id}")
    public Profesor obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    // 📌 Crear profesor
    @PostMapping
    public Profesor crear(@RequestBody Profesor profesor) {
        return service.guardar(profesor);
    }

    @GetMapping("/{id}/estudiantes")
public List<Estudiante> obtenerEstudiantes(@PathVariable Long id) {
    return service.obtenerEstudiantesPorProfesor(id);
}
    
}
