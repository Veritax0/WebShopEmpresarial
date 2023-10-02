package com.webShop.back.modelo;

import java.util.List;

public class Producto {
    private int id;
    private String nombre;
    private int precio;
    private int inventario;
    private String descripcion;
    private String caracteristicas;
    private List<String> listaImagenes;
    private Categoria categoria;

        //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public void setListaImagenes(List<String> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    //Getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public int getInventario() {
        return inventario;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }
    public List<String> getListaImagenes() {
        return listaImagenes;
    }
    public Categoria getCategoria() {
        return categoria;
    }
}



