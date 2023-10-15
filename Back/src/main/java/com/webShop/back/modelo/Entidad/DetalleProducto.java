package com.webShop.back.modelo.Entidad;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class DetalleProducto {
    @Getter @Setter
    private int id;
    @Getter @Setter
    private Inventario inventario;
    @Getter @Setter
    private String descripcion;
    @Getter @Setter
    private String caracteristicas;
    @Getter @Setter
    private List<String> listaImagenes;
    @Getter @Setter
    private Categoria categoria;
    @Getter @Setter
    private Producto producto;
    
    //Constructores
    public DetalleProducto() {
    }
    public DetalleProducto(int id, String nombre, int precio, Inventario inventario, String descripcion, String caracteristicas,
            List<String> listaImagenes, Categoria categoria) {
        this.setId(id);
        this.setInventario(inventario);
        this.setDescripcion(descripcion);
        this.setCaracteristicas(caracteristicas);
        this.setListaImagenes(listaImagenes);
        this.setCategoria(categoria);
    }

}