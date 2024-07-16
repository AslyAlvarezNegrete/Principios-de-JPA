package com.ejemplo.jpa_tutorial.controller;

import org.springframework.web.bind.annotation.RestController;
import com.ejemplo.jpa_tutorial.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import com.ejemplo.jpa_tutorial.model.Producto;

@RestController
public class ProductoController {

    @Autowired
	private ProductoService productoService;
	
    
	@GetMapping("/api/productos")
	public List<Producto> search() {
		return productoService.seach();
	}
	
	@GetMapping("/api/productos/{id}")
	public List<Producto> searchById(@PathVariable int id) {
		return productoService.findById(id);
    }    
	
	@GetMapping("/api/productos/search")
	public List<Producto> searchByNombre(@RequestParam String nombre) {
		return productoService.findByNombre(nombre);
	}
	
	@GetMapping("/api/productos/searchByPrecio")
	public List<Producto> searchByPrecio(@RequestParam double preciomin, @RequestParam double preciomax) {
		return productoService.findByPrecioBetween(preciomin, preciomax);
	}
    
}
