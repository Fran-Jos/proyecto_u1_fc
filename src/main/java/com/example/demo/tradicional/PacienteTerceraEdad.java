package com.example.demo.tradicional;

public class PacienteTerceraEdad extends Paciente {
	
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

}
