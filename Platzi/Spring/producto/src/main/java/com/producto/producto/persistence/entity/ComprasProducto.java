package com.producto.producto.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId   // cuando la clave primaria es compuesta
    private ComprasProductoPK id;
    private String cantidad;
    private Integer BigDecimal;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_compra",insertable = false,updatable = false)
    private Compra compra;
    @ManyToOne
    @JoinColumn(name ="id_producto",insertable = false,updatable = false)
    private Producto producto;

    public ComprasProductoPK getId() {
        return id;
    }
    public void setId(ComprasProductoPK id) {
        this.id = id;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public Integer getBigDecimal() {
        return BigDecimal;
    }
    public void setBigDecimal(Integer bigDecimal) {
        BigDecimal = bigDecimal;
    }
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
