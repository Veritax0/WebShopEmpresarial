package com.webShop.back.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webShop.back.modelo.DTO.CategoriaDTO;
import com.webShop.back.modelo.Entidad.Categoria;
import com.webShop.back.persistencia.ICategoriaDAO;



@Service
public class CategoriaServices {
    
    @Autowired     
    private ICategoriaDAO IcategoriaDAO;


    public CategoriaDTO buscarPorId(Long id){
        final Optional<Categoria> categoriaEncontrada = IcategoriaDAO.findById(id);
        if (categoriaEncontrada.isEmpty()){
            return null;  
        } else {
            return categoriaEncontrada.get().crearDto();
        }
    }

    public Categoria guardar(CategoriaDTO categoria) {
        try {
            Categoria categoriaNueva = new Categoria(categoria);
            return IcategoriaDAO.saveAndFlush(categoriaNueva);
        } catch (Exception e) {
            System.out.println("Error al guardar el detalle del producto"+ e);
            return null;
        }
    }

}
