package com.api.detallesjeans.categorymicroservice.services;

import com.api.detallesjeans.categorymicroservice.models.Categoria;

import java.util.List;

public interface ICategoriaService {
    public List<Categoria> listarCategoriasActivas();
    public List<Categoria> listarCategoriasInactivas();
    public Categoria registrarCategoria(Categoria categoria);
    public Categoria actualizarCategoria(Categoria categoria);
    public Categoria buscarPorId( Long idCategoria);
    public void eliminarCategoria(Long idCategoria);
}
