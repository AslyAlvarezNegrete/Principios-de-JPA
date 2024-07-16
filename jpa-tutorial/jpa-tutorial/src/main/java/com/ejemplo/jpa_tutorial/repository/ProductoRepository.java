package com.ejemplo.jpa_tutorial.repository;

import org.springframework.data.repository.CrudRepository;
import com.ejemplo.jpa_tutorial.model.Producto;
import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    
    List<Producto> findById(int id);
    List<Producto> findByNombre(String nombre);
	List<Producto> findByPrecioBetween(double preciomin, double preciomax);
}
