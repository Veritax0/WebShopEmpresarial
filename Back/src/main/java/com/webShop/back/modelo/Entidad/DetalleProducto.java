package com.webShop.back.modelo.Entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;


@Entity
public class DetalleProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    // private Inventario inventario;
    @Getter
    private String descripcion;
    @Getter
    private String caracteristicas;
    @Getter
    private String imagen1;
    @Getter
    private String imagen2;
    @Getter
    private String imagen3;
    @Getter
    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;

    //Constructores
    public DetalleProducto() {  
    }
    
    public DetalleProducto(Long id, String descripcion, String caracteristicas,
        String imagen1, String imagen2, String imagen3, Categoria categoria) {
        this.id = id;
        // this.inventario = inventario;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.imagen1 = imagen1;
        this.imagen1 = imagen2;
        this.imagen1 = imagen3;
        this.categoria = categoria;
    }
}