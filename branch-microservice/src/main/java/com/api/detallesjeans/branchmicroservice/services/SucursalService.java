package com.api.detallesjeans.branchmicroservice.services;

import com.api.detallesjeans.branchmicroservice.models.Sucursal;

import java.util.List;

public interface SucursalService {
    public List<Sucursal> listarSucursales();
    public List<Sucursal> listarSucursalesActivas();
    public Sucursal registrarSucursal(Sucursal sucursal);
}
