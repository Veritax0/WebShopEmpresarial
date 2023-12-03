package com.webShop.back.modelo.Entidad;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;

@Entity
public class CarritoCompras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter
    @OneToMany
    private List<DetallePedido> items;
    @Getter
    private double precioTotal;
    @Getter
    private Long cantidad;

    private static CarritoCompras carritoCompras = new CarritoCompras();

    public static CarritoCompras getCarritoCompras(){
        return carritoCompras;
    }

    public static void setCarritoCompras(CarritoCompras carritoCompras){
        CarritoCompras.carritoCompras = carritoCompras;
    }
    
    public CarritoCompras() {
    }
}
