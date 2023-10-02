package com.webShop.back.services;

import org.springframework.stereotype.Service;

import com.webShop.back.modelo.Categoria;
import com.webShop.back.persistencia.CategoriaDAO;

@Service
public class CategoriaServices {
    
    private CategoriaDAO categoriaDAO;
    //inyeccion de dependencias
    public CategoriaServices(CategoriaDAO categoriaDAO) {
        this.categoriaDAO = categoriaDAO;
    }

    public Categoria obtenerCategoria(){
        Categoria categoria = categoriaDAO.obtenerCategoria();
        return categoria;
    }
}
