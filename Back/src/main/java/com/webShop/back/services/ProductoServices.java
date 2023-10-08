package com.webShop.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webShop.back.modelo.DTO.ProductoDTO;
import com.webShop.back.persistencia.ProductoDAO;

@Service
public class ProductoServices {
    
    @Autowired
    private ProductoDAO productoDAO;
    
    // @Transactional
    public ProductoDTO obtenerProducto1(){
        ProductoDTO producto = productoDAO.obtenerProducto1();
        return producto;
    }

    public ProductoDTO obtenerProducto(int productoId) {
        ProductoDTO producto = productoDAO.obtenerProducto(productoId);
        return producto;
    }

}
