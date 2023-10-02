package com.webShop.back.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webShop.back.modelo.CarritoCompras;
import com.webShop.back.services.CarritoComprasServices;

@RestController
public class CarritoComprasControlador {
    
    private CarritoComprasServices carritoComprasServices;

    //inyeccion de dependencias
    public CarritoComprasControlador(CarritoComprasServices carritoComprasServices) {
        this.carritoComprasServices = carritoComprasServices;
    }

    @GetMapping("/obtenerCarrito")
    public CarritoCompras obtenerCarritoCompras(){
        return carritoComprasServices.obtenerCarritoCompras();
    }


}
