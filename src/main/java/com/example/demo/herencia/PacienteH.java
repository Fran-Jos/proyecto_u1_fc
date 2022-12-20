package com.example.demo.herencia;

public class PacienteH {
	
	private String nombre, cedula, tipo;
	
	protected Integer calcularDescuento() {
		System.out.println("Sin descuento");
		return 0;
	}
	
	
	
	//GETTER & SETTER

	@Override
	public String toString() {
		return "PacienteH [nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + "]";
	}



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
