package com.webShop.back.modelo.DTO;

import lombok.Getter;

public class ProductoDTO{
    @Getter
    private String nombre;
    @Getter
    private int precio;
    @Getter
    private String imagenPrincipal;
    // @Getter
    // private DetalleProductoDTO detalleProductoDTO;
    //Constructor
    public ProductoDTO(String nombre, int precio, String imagenPrincipal) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagenPrincipal = imagenPrincipal;
        // this.detalleProductoDTO = detalleProductoDTO;
    }

    public ProductoDTO() {
    }
    

}
