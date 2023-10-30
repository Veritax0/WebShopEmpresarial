package com.webShop.back.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webShop.back.modelo.Entidad.DetalleProducto;
import com.webShop.back.services.DetalleProductoServices;

@RestController
@RequestMapping ("/detalleProducto")
public class DetalleProductoControlador {

    @Autowired
    private DetalleProductoServices detalleProductoServices;

    @GetMapping("/{id}")
    public ResponseEntity<DetalleProducto> buscarPorId(@PathVariable Long id){
        DetalleProducto detalleProductoEncontrado = detalleProductoServices.buscarPorId(id);
        if (detalleProductoEncontrado == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return  ResponseEntity.ok(detalleProductoEncontrado);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<DetalleProducto> guardarDetalleProducto(@RequestBody DetalleProducto detalleProducto){  
        DetalleProducto detalleProductoGuardado = detalleProductoServices.guardar(detalleProducto);
        if (detalleProductoGuardado == null){
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
        } else {
            return  ResponseEntity.status(HttpStatus.CREATED).body(detalleProductoGuardado);
        }
    }


}