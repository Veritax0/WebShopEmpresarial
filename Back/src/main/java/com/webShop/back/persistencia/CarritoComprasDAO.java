package com.webShop.back.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.webShop.back.modelo.CarritoCompras;
import com.webShop.back.modelo.DetallePedido;

@Repository
public class CarritoComprasDAO {

    public CarritoCompras obtenerCarritoCompras(){
        CarritoCompras carritoCompras = new CarritoCompras();
        carritoCompras.setId(1);
        List<DetallePedido> listaItems = new ArrayList<DetallePedido>();
        DetallePedido detallePedido=new DetallePedidoDAO().obtenerPedido();
        listaItems.add(detallePedido);
        carritoCompras.setItems(listaItems);
        carritoCompras.setPrecioTotal(0);
        return carritoCompras;
    }
}
