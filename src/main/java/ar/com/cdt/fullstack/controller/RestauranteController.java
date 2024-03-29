package ar.com.cdt.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.fullstack.dto.Restaurante;
import ar.com.cdt.fullstack.helpers.Barrios;
import ar.com.cdt.fullstack.service.RestauranteService;

@RestController
@RequestMapping("/restaurante")
@CrossOrigin(origins = "*")
public class RestauranteController {
	
	@Autowired
	RestauranteService restauranteservice;
	
	@RequestMapping(method = RequestMethod.GET, value = "/getRestaurantes")
	public List<Restaurante> traerRestoGlobal() {
		List<Restaurante> resto = restauranteservice.getAllRestaurantes();
		return resto;
	};
	
	@RequestMapping(method = RequestMethod.GET, value = "/getBarrios")
	public List<Barrios> getAllBarrios(){
	List<Barrios> barrio = restauranteservice.getAllBarrios();
		return barrio;
	};
	
	@RequestMapping(method = RequestMethod.GET, value = "/getRestaurantePorBarrio/{barrio}")
	public List<Restaurante> getRestaurantesPorBarrio(@PathVariable String barrio){
		List<Restaurante> restos = restauranteservice.getRestaurantesPorBarrio(barrio);
		return restos;
	}

}
