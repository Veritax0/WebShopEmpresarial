package com.webShop.back.modelo.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

import lombok.Getter;

@Entity 
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter
    private String nombre;
    @Getter
    @OneToMany(mappedBy = "categoria")
    private Set<DetalleProducto> detalleProducto;

}
