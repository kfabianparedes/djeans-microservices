package com.api.detallesjeans.storemicroservice.dao;

import com.api.detallesjeans.storemicroservice.models.Tienda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends CrudRepository<Tienda, Long> {

}