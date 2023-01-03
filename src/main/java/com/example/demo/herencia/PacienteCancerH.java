package com.example.demo.herencia;

public class PacienteCancerH extends PacienteH{
	public Integer calcularDescuento() {
		System.out.println("Paciente con descuento del 30%");
		return 30;
	}
}
