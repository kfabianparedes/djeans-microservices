package com.api.detallesjeans.categorymicroservice.controllers;

import com.api.detallesjeans.categorymicroservice.models.Categoria;
import com.api.detallesjeans.categorymicroservice.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping()
    private List<Categoria> listarCategoriasActivas(){
        return categoriaService.listarCategoriasActivas();
    }
    @GetMapping("/inactivo")
    private List<Categoria> listarCategoriasInactivas(){
        return categoriaService.listarCategoriasInactivas();
    }
    @GetMapping("/{idCategoria}")
    private Categoria detalleCategoria(@PathVariable Long idCategoria){
        return categoriaService.buscarPorId(idCategoria);
    }

    @PostMapping()
    private Categoria registrarCategoria(@RequestBody Categoria categoria){
        return categoriaService.registrarCategoria(categoria);
    }
}
