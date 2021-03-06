package com.api.detallesjeans.branchmicroservice.dao;

import com.api.detallesjeans.branchmicroservice.models.Sucursal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ISucursalDao extends CrudRepository<Sucursal, Long> {

    @Query("select s from Sucursal s where s.suc_estado = true")
    List<Sucursal> findBySuc_estadoIsTrue();

}