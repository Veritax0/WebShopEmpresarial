package com.webShop.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webShop.back.modelo.Entidad.Categoria;
import com.webShop.back.modelo.Entidad.DetalleProducto;
import com.webShop.back.persistencia.ICategoriaDAO;
import com.webShop.back.persistencia.IDetalleProductoDAO;


@Service
public class CategoriaServices {
    
    @Autowired     
    private ICategoriaDAO categoriaDAO;

    public Categoria guardar(Categoria categoria) {
        try {
            return categoriaDAO.saveAndFlush(categoria);
        } catch (Exception e) {
            System.out.println("Error al guardar el detalle del producto"+ e);
            return null;
        }
    }

}
