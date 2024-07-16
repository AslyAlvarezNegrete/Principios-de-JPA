package com.ejemplo.jpa_tutorial.service;

import com.ejemplo.jpa_tutorial.model.Producto;
import java.util.List;

public interface ProductoService {

    List<Producto> seach();
	List<Producto> findById(int id);
	List<Producto> findByNombre(String nombre);
	List<Producto> findByPrecioBetween(double preciomin, double preciomax);
}
