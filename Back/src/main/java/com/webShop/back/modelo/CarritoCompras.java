package com.webShop.back.modelo;

import java.util.List;

public class CarritoCompras {
    private int id;
    private List<DetallePedido> items;
    private double precioTotal;

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setItems(List<DetallePedido> items) {
        this.items = items;
    }
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    //Getters
    public int getId() {
        return id;
    }
    public List<DetallePedido> getItems() {
        return items;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    
}
