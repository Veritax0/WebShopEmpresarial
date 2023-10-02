package com.webShop.back.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.webShop.back.modelo.Producto;
@Repository
public class ProductoDAO {
    

    public Producto obtenerProducto(){
        Producto producto = new Producto();
        producto.setNombre("Producto 1");
        producto.setPrecio(100);
        producto.setInventario(10);
        producto.setDescripcion("Descripcion del producto 1");
        producto.setCaracteristicas("Caracteristicas del producto 1");
        producto.setCategoria(new CategoriaDAO().obtenerCategoria());
        List<String> listaImagenes = new ArrayList<>();
        listaImagenes.add("imagen1");
        listaImagenes.add("imagen2");
        listaImagenes.add("imagen3");
        producto.setListaImagenes(listaImagenes);
        return producto;
        


    }
}
