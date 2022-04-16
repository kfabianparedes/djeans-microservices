package com.api.detallesjeans.categorymicroservice.services;

import com.api.detallesjeans.categorymicroservice.models.Categoria;
import com.api.detallesjeans.categorymicroservice.dao.ICategoriaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private ICategoriaDao categoriaDao;

    @Override
    @Transactional
    public List<Categoria> listarCategoriasActivas() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    @Transactional
    public List<Categoria> listarCategoriasInactivas() {
        return null;
    }

    @Override
    @Transactional
    public Categoria registrarCategoria(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public Categoria buscarPorId(Long idCategoria) {
        return categoriaDao.findById(idCategoria).orElse(null);
    }

    @Override
    @Transactional
    public void eliminarCategoria(Long idCategoria) {
    }
}
