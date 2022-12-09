package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.IcuentaBancariaService;
import com.example.demo.banco.service.ItransferenciaService;
import com.example.demo.spring.CitaMedicaSB;
import com.example.demo.spring.MedicoSB;
import com.example.demo.spring.PacienteCancerSB;
import com.example.demo.spring.PacienteTerceraEdadSB;
import com.example.demo.tradicional.CitaMedica;
import com.example.demo.tradicional.PacienteTerceraEdad;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private IcuentaBancariaService bancariaService;
	@Autowired
	private ItransferenciaService itransferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("002");
		cuenta1.setTipo("Ahorros");
		cuenta1.setTitular("Francisco Chantataxi");
		cuenta1.setSaldo(new BigDecimal(100));
		this.bancariaService.insertar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("001");
		cuenta2.setTipo("Ahorros");
		cuenta2.setTitular("Jose Mancheno");
		cuenta2.setSaldo(new BigDecimal(10));
		this.bancariaService.insertar(cuenta2);
		
		System.out.println("reporte 1");
		for (Transferencia t : this.itransferenciaService.BuscarReporte()) {
			System.out.println(t);
		}
		
		this.itransferenciaService.realizar("001", "002", new BigDecimal(200));
		
		System.out.println("reporte 2");
		for (Transferencia t : this.itransferenciaService.BuscarReporte()) {
			System.out.println(t);
		}
		
	}

}