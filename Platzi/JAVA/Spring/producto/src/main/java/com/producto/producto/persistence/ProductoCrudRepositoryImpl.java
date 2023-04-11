package com.producto.producto.persistence;

import com.producto.producto.persistence.crud.ProductoCrudRepository;
import com.producto.producto.persistence.entity.Producto;

import java.util.List;

public class ProductoCrudRepositoryImpl {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombre(idCategoria);

    }
}
