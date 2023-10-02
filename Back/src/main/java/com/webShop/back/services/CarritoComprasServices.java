package com.webShop.back.services;

import org.springframework.stereotype.Service;

import com.webShop.back.modelo.CarritoCompras;
import com.webShop.back.persistencia.CarritoComprasDAO;

@Service
public class CarritoComprasServices {
    
    private CarritoComprasDAO carritoComprasDAO;
    //inyeccion de dependencias
    public CarritoComprasServices(CarritoComprasDAO carritoComprasDAO) {
        this.carritoComprasDAO = carritoComprasDAO;
    }

    public CarritoCompras obtenerCarritoCompras(){
        CarritoCompras carritoCompras = carritoComprasDAO.obtenerCarritoCompras();
        return carritoCompras;
    }

}
