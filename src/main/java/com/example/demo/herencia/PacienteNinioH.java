package com.example.demo.herencia;

public class PacienteNinioH extends PacienteH{
	
	private int pesoNacimiento;

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}

	@Override
	public String toString() {
		return super.toString() + " PacienteNinio [pesoNacimiento=" + pesoNacimiento + "]";
	}

	public Integer calcularDescuento() {
		System.out.println("Paciente Ninio con el 10% descuento");
		return 10;
	}
}
