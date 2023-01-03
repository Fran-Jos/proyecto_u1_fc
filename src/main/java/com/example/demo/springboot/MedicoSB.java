package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class MedicoSB {

	private String nombre, cedula;
	
	//GETTER & SETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
}
