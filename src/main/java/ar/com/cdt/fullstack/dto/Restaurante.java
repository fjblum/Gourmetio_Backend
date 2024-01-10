package ar.com.cdt.fullstack.dto;

import ar.com.cdt.fullstack.helpers.Barrios;

public class Restaurante {

	public String nombre;
	public String direccion;
	public String imagen;
	public Barrios barrio;

	public Restaurante() {
		super();
	}

	public Restaurante(String nombre, String direccion, String imagen, Barrios barrio) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.imagen = imagen;
		this.barrio = barrio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Barrios getBarrio() {
		return barrio;
	}

	public void setBarrio(Barrios barrio) {
		this.barrio = barrio;
	}

}
