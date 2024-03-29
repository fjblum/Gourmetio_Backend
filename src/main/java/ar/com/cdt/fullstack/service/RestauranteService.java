package ar.com.cdt.fullstack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.cdt.fullstack.dto.Restaurante;
import ar.com.cdt.fullstack.helpers.Barrios;

@Service
public interface RestauranteService {

	public Restaurante setRestaurante(String nombre, String direccion, String rutaImagen, Barrios barrio);
	
	public List<Restaurante> getAllRestaurantes();
	
	public List<Barrios> getAllBarrios();
	
	public List<Restaurante> getRestaurantesPorBarrio(String barrio);

}
