package com.webShop.back.controladores;


import com.webShop.back.modelo.DTO.ProductoDTO;
import com.webShop.back.services.ProductoServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/producto")
public class ProductoControlador {

    @Autowired
    private ProductoServices productoServices;
    
    @GetMapping("/1")
    public ProductoDTO obtenerProducto1(){
        return productoServices.obtenerProducto1();
    }

    @GetMapping("/{productoId}")
    public ProductoDTO obtenerProductor(@PathVariable int productoId){
        return productoServices.obtenerProducto(productoId);
    }
}
