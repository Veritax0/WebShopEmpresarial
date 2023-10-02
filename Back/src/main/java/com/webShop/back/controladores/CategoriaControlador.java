package com.webShop.back.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webShop.back.modelo.Categoria;
import com.webShop.back.services.CategoriaServices;

@RestController
public class CategoriaControlador {
    
    private CategoriaServices categoriaServices;

    //inyeccion de dependencias
    public CategoriaControlador(CategoriaServices categoriaServices) {
        this.categoriaServices = categoriaServices;
    }

    @GetMapping("/obtenerCategoria")
    public Categoria obtenerCategoria(){
        return categoriaServices.obtenerCategoria();
    }

}
