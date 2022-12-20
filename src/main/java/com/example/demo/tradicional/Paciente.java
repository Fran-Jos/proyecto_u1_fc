package com.example.demo.tradicional;

public class Paciente {
	
	private String nombre, cedula, tipo;
	
	
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + "]";
	}


	
	//GETTER & SETTER

	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getCedula() {
		return cedula;
	}

	protected void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

}
