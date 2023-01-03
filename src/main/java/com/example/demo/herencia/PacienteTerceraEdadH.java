package com.example.demo.herencia;

public class PacienteTerceraEdadH extends PacienteH {
	
	private String codigoIESS;

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}

	@Override
	public String toString() {
		return super.toString() + " PacienteTerceraEdad [codigoIESS=" + codigoIESS + "]";
	}
	
	public Integer calcularDescuento() {
		System.out.println("Paciente con descuento del 20%");
		return 20;
	}
}
