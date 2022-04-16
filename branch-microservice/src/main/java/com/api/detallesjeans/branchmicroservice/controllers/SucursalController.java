package com.api.detallesjeans.branchmicroservice.controllers;

import com.api.detallesjeans.branchmicroservice.models.Sucursal;
import com.api.detallesjeans.branchmicroservice.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/sucursal")
@RestController
public class SucursalController {

    @Autowired
    SucursalService sucursalService;

    @GetMapping()
    private List<Sucursal> listarSucursales(){
        return sucursalService.listarSucursales();
    }
    @GetMapping("/activo")
    private List<Sucursal> listarSucursalesActivas(){
        return sucursalService.listarSucursalesActivas();
    }
    @PostMapping()
    private Sucursal registrarSucursal(@RequestBody Sucursal sucursal){
        return sucursalService.registrarSucursal(sucursal);
    }

}
