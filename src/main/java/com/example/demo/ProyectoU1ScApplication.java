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
	

		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("0002");
		cuenta2.setTipo("Ahorros");
		cuenta2.setTitular("Jose Mancheno");
		cuenta2.setSaldo(new BigDecimal(200));
		this.bancariaService.insertar(cuenta2);
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("0001");
		cuenta1.setTipo("Ahorros");
		cuenta1.setTitular("Francisco Chantataxi");
		cuenta1.setSaldo(new BigDecimal(100));
		this.bancariaService.insertar(cuenta1);
		this.bancariaService.insertar(cuenta1);

		System.out.println("saldos actuales:");
		CuentaBancaria cuentaActual1 = this.bancariaService.buscarPorNumero("0001");
		CuentaBancaria cuentaActual2 = this.bancariaService.buscarPorNumero("0002");

		System.out.println("saldo actual : " + cuentaActual1.getSaldo());
		System.out.println("saldo actual : " + cuentaActual2.getSaldo());

		System.out.println("reporte 1");
		for (Transferencia t : this.itransferenciaService.BuscarReporte()) {
			System.out.println(t);
		}

		this.itransferenciaService.realizar("0001", "0002", new BigDecimal(10));

		System.out.println("reporte 2");
		for (Transferencia t : this.itransferenciaService.BuscarReporte()) {
			System.out.println(t);
		}

		System.out.println("saldos nuevos:");
		CuentaBancaria cuentaConsultada1 = this.bancariaService.buscarPorNumero("0001");
		CuentaBancaria cuentaConsultada2 = this.bancariaService.buscarPorNumero("0002");
		

		System.out.println("nuevo saldo: " + cuentaConsultada1.getSaldo());
		System.out.println("nuevo saldo : " + cuentaConsultada2.getSaldo());
		
		System.out.println(cuentaConsultada1);
		System.out.println(cuentaConsultada2);
		

	}

}