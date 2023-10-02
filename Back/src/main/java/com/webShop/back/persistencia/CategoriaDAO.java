package com.webShop.back.persistencia;

import org.springframework.stereotype.Repository;

import com.webShop.back.modelo.Categoria;

@Repository
public class CategoriaDAO {
    
    public Categoria obtenerCategoria(){
        Categoria categoria = new Categoria();
        categoria.setId(1);
        categoria.setNombre("Categoria 1");
        return categoria;
    }

}
