package com.example.demo.springboot;

public class PacienteSB {
	
	private String nombre, cedula, tipo;
	
	protected Integer calcularDescuento() {
		System.out.println("Sin descuento");
		return 0;
	}
	
	
	
	//GETTER & SETTER

	@Override
	public String toString() {
		return "PacienteSB [nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + "]";
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

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
	

}
