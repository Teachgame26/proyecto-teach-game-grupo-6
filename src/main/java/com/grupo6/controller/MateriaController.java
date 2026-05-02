package com.grupo6.controller;

import com.grupo6.model.entity.Materia;
import com.grupo6.service.MateriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    private final MateriaService service;

    public MateriaController(MateriaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Materia> listar() {
        return service.obtenerTodas();
    }

    @PostMapping
    public Materia crear(@RequestBody Materia materia) {
        return service.guardar(materia);
    }
}