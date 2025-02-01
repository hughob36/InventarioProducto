package com.productoInventario.inventario.controller;


import com.productoInventario.inventario.entity.Producto;
import com.productoInventario.inventario.service.IServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerProducto {

    @Autowired
    private IServiceProducto serviceProducto;

    @GetMapping("/producto/traer")
    @ResponseBody
    public List<Producto> getProducto(){
        return serviceProducto.getProducto();
    }

    @GetMapping("/producto/traer/{id}")
    @ResponseBody
    public Producto getProducto(@PathVariable Integer id){
        return serviceProducto.getProducto(id);
    }

    @PostMapping("/producto/crear")
    public Producto saveProducto(@RequestBody Producto producto){
        return serviceProducto.saveProducto(producto);
    }

    @PutMapping("/producto/edit")
    public Producto editProducto(@RequestBody Producto producto){
        return serviceProducto.editProducto(producto);
    }

    @DeleteMapping("/producto/delete/{id}")
    public void deleteProducto(@PathVariable Integer id){
        serviceProducto.deleteProducto(id);
    }

}
