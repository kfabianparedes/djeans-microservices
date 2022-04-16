package com.api.detallesjeans.branchmicroservice.services;

import com.api.detallesjeans.branchmicroservice.models.Sucursal;
import com.api.detallesjeans.branchmicroservice.dao.ISucursalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImpl implements SucursalService{
    @Autowired
    ISucursalDao sucursalDao;

    @Override
    public List<Sucursal> listarSucursales() {
        return (List<Sucursal>) sucursalDao.findAll();
    }
    @Override
    public List<Sucursal> listarSucursalesActivas() {
        return sucursalDao.findBySuc_estadoIsTrue();
    }
    @Override
    public Sucursal registrarSucursal(Sucursal sucursal) {
        return sucursalDao.save(sucursal);
    }
}
