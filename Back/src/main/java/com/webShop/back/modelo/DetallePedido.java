package com.webShop.back.modelo;

public class DetallePedido {
    private int id;
    private Producto producto;
    private int cantidad;
    private double precioPonderado;

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setPrecioPonderado(double precioPonderado) {
        this.precioPonderado = precioPonderado;
    }
    //Getters
    public int getId() {
        return id;
    }
    public Producto getProducto() {
        return producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecioPonderado() {
        return precioPonderado;
    }

}
