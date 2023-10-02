package com.webShop.back.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webShop.back.modelo.DetallePedido;
import com.webShop.back.services.DetallePedidoServices;

@RestController
public class DetallePedidoControlador {
    
    private DetallePedidoServices detallePedidoServices;

    //inyeccion de dependencias
    public DetallePedidoControlador(DetallePedidoServices detallePedidoServices) {
        this.detallePedidoServices = detallePedidoServices;
    }

    @GetMapping("/obtenerPedido")
    public DetallePedido obtenerPedido(){
        return detallePedidoServices.obtenerPedido();
    }
}
