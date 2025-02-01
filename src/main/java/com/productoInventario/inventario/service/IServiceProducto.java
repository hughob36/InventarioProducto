package com.productoInventario.inventario.service;

import com.productoInventario.inventario.entity.Producto;

import java.util.List;

public interface IServiceProducto {

    public Producto saveProducto(Producto producto);

    public Producto getProducto(Integer id);

    public List<Producto> getProducto();

    public Producto editProducto(Producto producto);

    public void deleteProducto(Integer id);
}
