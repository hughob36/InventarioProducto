package com.productoInventario.inventario.repository;

import com.productoInventario.inventario.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryProducto extends JpaRepository <Producto,Integer> {
}
