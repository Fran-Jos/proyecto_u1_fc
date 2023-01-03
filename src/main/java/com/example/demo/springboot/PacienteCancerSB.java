package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class PacienteCancerSB extends PacienteSB{
	public Integer calcularDescuento() {
		System.out.println("Paciente con descuento del 30%");
		return 30;
	}
}
