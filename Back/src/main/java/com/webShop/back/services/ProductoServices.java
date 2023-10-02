package com.webShop.back.services;

import org.springframework.stereotype.Service;

import com.webShop.back.modelo.Producto;
import com.webShop.back.persistencia.ProductoDAO;
@Service
public class ProductoServices {
    
    private ProductoDAO productoDAO;
    //inyeccion de dependencias
    public ProductoServices(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    
    public Producto obtenerProducto(){
        Producto producto = productoDAO.obtenerProducto();
        return producto;
    }



}
