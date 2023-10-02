package com.webShop.back.persistencia;

import org.springframework.stereotype.Repository;

import com.webShop.back.modelo.DetallePedido;

@Repository
public class DetallePedidoDAO {

    public DetallePedido obtenerPedido(){
        DetallePedido detallePedido = new DetallePedido();
        detallePedido.setId(1);
        detallePedido.setCantidad(10);
        detallePedido.setPrecioPonderado(100);
        detallePedido.setProducto(new ProductoDAO().obtenerProducto());
        return detallePedido;
    }
}

