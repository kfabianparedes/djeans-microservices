package com.api.detallesjeans.storemicroservice.services;

import com.api.detallesjeans.storemicroservice.models.Tienda;

import java.util.List;

public interface ITiendaService {
    public List<Tienda> listarTiendas();
    public List<Tienda> listarTiendasActivas();
    public Tienda registrarTienda(Tienda tienda);

}
