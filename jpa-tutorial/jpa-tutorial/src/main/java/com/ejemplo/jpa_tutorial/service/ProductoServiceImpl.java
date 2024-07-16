package com.ejemplo.jpa_tutorial.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.jpa_tutorial.model.Producto;
import com.ejemplo.jpa_tutorial.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

	@Override
	public List<Producto> seach() {
		return (List<Producto>) productoRepository.findAll();
	}
	
	@Override
	public List<Producto> findById(int id) {
		return (List<Producto>) productoRepository.findById(id);
	} 

	@Override
	public List<Producto> findByNombre(String nombre) {
		return productoRepository.findByNombre(nombre);
	}
	
	@Override
	public List<Producto> findByPrecioBetween(double preciomin, double preciomax) {
		return productoRepository.findByPrecioBetween(preciomin, preciomax);
	}
}
