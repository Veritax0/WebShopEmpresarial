package com.webShop.back.modelo.Entidad;



import lombok.Getter;
import lombok.Setter;


public class Producto {
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private int precio;
    @Getter @Setter
    private String imagenPrincipal;
    @Getter @Setter
    private DetalleProducto detalleProducto;
}
