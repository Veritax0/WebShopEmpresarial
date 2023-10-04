package com.webShop.back.persistencia;

import org.springframework.stereotype.Repository;

import com.webShop.back.modelo.DTO.ProductoDTO;
@Repository
public class ProductoDAO {
    
    public ProductoDTO obtenerProducto1(){
        ProductoDTO producto = new ProductoDTO("Producto 1", 100, "Imagen 1", null);
        return producto;
    }

    public ProductoDTO obtenerProducto(int productoId) {
        ProductoDTO producto = new ProductoDTO("Producto "+productoId, 100, "Imagen "+productoId, null);
        return producto;
    }


}
