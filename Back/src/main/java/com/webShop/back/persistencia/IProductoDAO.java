package com.webShop.back.persistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import com.webShop.back.modelo.Entidad.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Long> {
    
}
