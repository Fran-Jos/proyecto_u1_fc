package com.example.demo.herencia;

public class PacienteCancerH extends PacienteH{
	public Integer calcularDescuento() {
		System.out.println("paciente ninio con el 30% del descuento");
		return 30;
	}
}
