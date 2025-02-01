package com.productoInventario.inventario.service;

import com.productoInventario.inventario.entity.Producto;
import com.productoInventario.inventario.repository.IRepositoryProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProducto implements IServiceProducto {

    @Autowired
    private IRepositoryProducto repositoryProducto;

    @Override
    public Producto saveProducto(Producto producto) {
        return repositoryProducto.save(producto);
    }

    @Override
    public Producto getProducto(Integer id) {
        return repositoryProducto.findById(id).orElse(null);
    }

    @Override
    public List<Producto> getProducto() {
        return repositoryProducto.findAll();
    }

    @Override
    public Producto editProducto(Producto producto) {
        return repositoryProducto.save(producto);
    }

    @Override
    public void deleteProducto(Integer id) {
        repositoryProducto.deleteById(id);
    }
}
