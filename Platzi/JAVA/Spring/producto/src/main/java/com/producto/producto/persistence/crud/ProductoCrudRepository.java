package com.producto.producto.persistence.crud;

import com.producto.producto.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {  // debe estar el nombre de la tabla y el tipo de dato de la llave primaria

    //tambien se puede hacer un query nativo:
  //  @Query(value= "SELECT * FROM productos WHERE id_categoria =?", nativeQuery = true)

    //Este es un query method Ver la pagina de referencia
    List<Producto> findByIdCategoriaOrderByNombre(int idCategoria); // este idCategoria debe ser el de la clase
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
