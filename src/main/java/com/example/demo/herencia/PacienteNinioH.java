package com.example.demo.herencia;

public class PacienteNinioH extends PacienteH {
private int pesoNacimiento;

public int getPesoNacimiento() {
	return pesoNacimiento;
}

public void setPesoNacimiento(int pesoNacimiento) {
	this.pesoNacimiento = pesoNacimiento;
}

public Integer calcularDescuento() {
	System.out.println("paciente ninio con el 10% del descuento");
	return 10;
}
}
