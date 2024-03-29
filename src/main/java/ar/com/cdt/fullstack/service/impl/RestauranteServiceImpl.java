package ar.com.cdt.fullstack.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.cdt.fullstack.dto.Restaurante;
import ar.com.cdt.fullstack.helpers.Barrios;
import ar.com.cdt.fullstack.service.RestauranteService;

@Service
public class RestauranteServiceImpl implements RestauranteService {

	@Override
	public Restaurante setRestaurante(String nombre, String direccion, String rutaImagen, Barrios barrio) {
		Restaurante restaurante = new Restaurante();
		restaurante.setNombre(nombre);
		restaurante.setDireccion(direccion);
		restaurante.setImagen(rutaImagen);
		restaurante.setBarrio(barrio);
		return restaurante;
	}

	@Override
	public List<Restaurante> getAllRestaurantes() {
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();

		Restaurante resto1 = setRestaurante("El resto de Pablo", "Calle falsa 123, Flores", "restos/image1.png",
				Barrios.FLORES);
		Restaurante resto2 = setRestaurante("Felsch Cafe", "Calle falsa 123, Flores", "restos/image1.png",
				Barrios.FLORES);
		Restaurante resto3 = setRestaurante("Julian Pollo al verdeo", "Calle falsa 123, Flores", "restos/image1.png",
				Barrios.FLORES);
		Restaurante resto4 = setRestaurante("Roberto", "Calle falsa 123, Flores", "restos/image1.png",
				Barrios.CABALLITO);
		Restaurante resto5 = setRestaurante("Granja Agroecológica de Guernica", "Neuquén 1020, Caballito",
				"restos/image1.png", Barrios.CABALLITO);
		Restaurante resto6 = setRestaurante("Comida", "Gaona 203", "restos/image1.png", Barrios.CABALLITO);
		Restaurante resto7 = setRestaurante("LO DEL PELA", "Avenida re trucha 123, Flores", "restos/image1.png",
				Barrios.CABALLITO);
		Restaurante resto8 = setRestaurante("El Asador Criollo", "Calle Segurola 567, Caballito", "restos/image1.png",
				Barrios.CABALLITO);
		Restaurante resto9 = setRestaurante("La Pizzería del Parque", "Avenida Rivadavia 890, Caballito",
				"restos/image1.png", Barrios.CABALLITO);
		Restaurante resto10 = setRestaurante("Café de la Plaza", "Calle Rojas 123, Caballito", "restos/image1.png",
				Barrios.CABALLITO);
		Restaurante resto11 = setRestaurante("Burger Heaven", "Avenida Avellaneda 456, Caballito", "restos/image1.png",
				Barrios.CABALLITO);
		Restaurante resto12 = setRestaurante("Sushi Time", "Calle Nicasio Oroño 789, Caballito", "restos/image1.png",
				Barrios.CABALLITO);
		Restaurante resto13 = setRestaurante("Churros El Topo", "Abbey Road 729, Parque Chacabuco", "restos/image1.png",
				Barrios.PCH);
		Restaurante resto14 = setRestaurante("El Chino por peso", "Calle dobla a la derecha 333, Parque Chacabuco",
				"restos/image1.png", Barrios.PCH);
		Restaurante resto15 = setRestaurante("Mercado Hernan", "Avenida falsa 789, Parque Chacabuco",
				"restos/image1.png", Barrios.PCH);
		Restaurante resto16 = setRestaurante("Hardcodeado", "La Oficina 473", "restos/image1.png", Barrios.ALMAGRO);
		Restaurante resto17 = setRestaurante("Las arepas de Charly II", "Calle falsa 456, Almagro", "restos/image1.png",
				Barrios.ALMAGRO);
		Restaurante resto18 = setRestaurante("Empanaditas", "A la vuelta de la oficina", "restos/image1.png",
				Barrios.ALMAGRO);
		Restaurante resto19 = setRestaurante("Pasteleria Kollmann", "Avenida re trucha 123, Almagro",
				"restos/image1.png", Barrios.ALMAGRO);

		restaurantes.add(resto1);
		restaurantes.add(resto2);
		restaurantes.add(resto3);
		restaurantes.add(resto4);
		restaurantes.add(resto5);
		restaurantes.add(resto6);
		restaurantes.add(resto7);
		restaurantes.add(resto8);
		restaurantes.add(resto9);
		restaurantes.add(resto10);
		restaurantes.add(resto11);
		restaurantes.add(resto12);
		restaurantes.add(resto13);
		restaurantes.add(resto14);
		restaurantes.add(resto15);
		restaurantes.add(resto16);
		restaurantes.add(resto17);
		restaurantes.add(resto18);
		restaurantes.add(resto19);

		return restaurantes;
	}

	@Override
	public List<Barrios> getAllBarrios() {
		List<Barrios> barrios = Arrays.asList(Barrios.values());
		return barrios;
	}

	@Override
	public List<Restaurante> getRestaurantesPorBarrio(String barrio) {
		List<Restaurante> restaurantes = getAllRestaurantes();

		List<Restaurante> restosfiltrados = new ArrayList<Restaurante>();
		restaurantes.forEach(resto -> {
			if (resto.getBarrio().toString().equals(barrio)) {
				restosfiltrados.add(resto);
			}
		});
		return restosfiltrados;
	}

}
