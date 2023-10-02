package com.webShop.back.controladores;

import com.webShop.back.modelo.Producto;
import com.webShop.back.services.ProductoServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoControlador {
    
    private ProductoServices productoServices;

    //inyeccion de dependencias
    public ProductoControlador(ProductoServices productoServices) {
        this.productoServices = productoServices;
    }

    @GetMapping("/obtenerProducto")
    public Producto obtenerProducto(){
        return productoServices.obtenerProducto();
    }
}
