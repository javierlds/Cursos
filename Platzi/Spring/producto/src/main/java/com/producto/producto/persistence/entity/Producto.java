package com.producto.producto.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Java genera automatico el incremental
    @Column(name="id_producto")
    private Integer idProducto;
    private String nombre;
    @Column(name="id_categoria")
    private Integer idCategoria;
    @Column(name="codigo_barras")
    private String codigoBarras;
    @Column(name="precio_venta")
    private Double precioVenta;
    @Column(name="cantidad_stock")
    private Integer cantidadStock;
    private Boolean estado;

    @ManyToOne   // Relacion de muchos a uno, esto segun el modelo muchos productos pertenecen a una categoria.
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) // esto me indica que no puedo borrar ni insertar la categoria debo hacerlo en la clase categoria
    private Categoria categoria;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> producto;
    public Integer getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public Double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public Integer getCantidadStock() {
        return cantidadStock;
    }
    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public List<ComprasProducto> getProducto() {
        return producto;
    }
    public void setProducto(List<ComprasProducto> producto) {
        this.producto = producto;
    }
}