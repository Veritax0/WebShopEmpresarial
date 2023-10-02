package com.webShop.back.services;

import org.springframework.stereotype.Service;
import com.webShop.back.modelo.DetallePedido;
import com.webShop.back.persistencia.DetallePedidoDAO;

@Service
public class DetallePedidoServices {
    
    private DetallePedidoDAO detallePedidoDAO;
    //inyeccion de dependencias
    
    public DetallePedidoServices(DetallePedidoDAO detallePedidoDAO) {
        this.detallePedidoDAO = detallePedidoDAO;
    }
    
    public DetallePedido obtenerPedido(){
        DetallePedido detallePedido = detallePedidoDAO.obtenerPedido();
        return detallePedido;
    }

}
