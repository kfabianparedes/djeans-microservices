package com.api.detallesjeans.categorymicroservice.dao;

import com.api.detallesjeans.categorymicroservice.models.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface ICategoriaDao extends CrudRepository<Categoria, Long>{

}