package com.producto.producto.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable  //anotacion que indica que esta clase sera embebida en la clase ComprasProducto
public class ComprasProductoPK implements Serializable {  // Serializable indica que el objeto se convierte en bytes y es posible enviarlo a travez de la red o un medio de almacenamiento

    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    public Integer getIdCompra(){
        return idCompra;
    }

    public void setIdCompra(Integer idCompra){
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}