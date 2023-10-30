package com.webShop.back.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webShop.back.modelo.Entidad.Categoria;
import com.webShop.back.modelo.Entidad.DetalleProducto;
import com.webShop.back.services.CategoriaServices;
import com.webShop.back.services.DetalleProductoServices;

@RestController
@RequestMapping ("/categoria")
public class CategoriaControlador {
    
    @Autowired
    private CategoriaServices categoriaServices;
    
    @PostMapping("/guardar")
    public ResponseEntity<Categoria> guardarcategoria(@RequestBody Categoria categoria){  
        Categoria categoriaGuardado = categoriaServices.guardar(categoria);
        if (categoriaGuardado == null){
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
        } else {
            return  ResponseEntity.status(HttpStatus.CREATED).body(categoriaGuardado);
        }
    }

}
