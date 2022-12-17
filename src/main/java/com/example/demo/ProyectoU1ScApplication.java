package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.modelo.tienda.service.IProductoService;
import com.example.demo.banco.service.IcuentaBancariaService;
import com.example.demo.banco.service.ItransferenciaService;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IVehiculoService;
import com.example.demo.ejercicio1.service.IpropietarioService;
import com.example.demo.spring.CitaMedicaSB;
import com.example.demo.spring.MedicoSB;
import com.example.demo.spring.PacienteCancerSB;
import com.example.demo.spring.PacienteTerceraEdadSB;
import com.example.demo.tradicional.CitaMedica;
import com.example.demo.tradicional.PacienteTerceraEdad;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

//	@Autowired
//	private IcuentaBancariaService bancariaService;
//	@Autowired
//	private ItransferenciaService itransferenciaService;
//	

	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IpropietarioService ipropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	

	Vehiculo v = new Vehiculo();
	
	v.setMarca("Toyota");
	v.setPlaca("Pasa-122");
	v.setPrecio(new BigDecimal(20000));
	v.setTipo("P");
	
	this.iVehiculoService.crear(v);
	
	v.setPrecio(new BigDecimal(10000));
	v.setMarca("Chevrolet");
	this.iVehiculoService.modificar(v);
	
	Propietario propietario = new Propietario();
	propietario.setApellido("Taco");
	propietario.setCedula("23432424");
	propietario.setFechaNacimiento(LocalDateTime.of(1989, 7,7,12,35));
	propietario.setNombre("Gabriela");
	this.ipropietarioService.guardar(propietario);
	
	
	this.iMatriculaService.matricular( "Pasa-122","23432424");
			
	
	
		
//		CuentaBancaria cuenta2 = new CuentaBancaria();
//		cuenta2.setNumero("0002");
//		cuenta2.setTipo("Ahorros");
//		cuenta2.setTitular("Jose Mancheno");
//		cuenta2.setSaldo(new BigDecimal(200));
//		this.bancariaService.insertar(cuenta2);
//		
//		CuentaBancaria cuenta1 = new CuentaBancaria();
//		cuenta1.setNumero("0001");
//		cuenta1.setTipo("Ahorros");
//		cuenta1.setTitular("Francisco Chantataxi");
//		cuenta1.setSaldo(new BigDecimal(100));
//		this.bancariaService.insertar(cuenta1);
//		this.bancariaService.insertar(cuenta1);
//
//		System.out.println("saldos actuales:");
//		CuentaBancaria cuentaActual1 = this.bancariaService.buscarPorNumero("0001");
//		CuentaBancaria cuentaActual2 = this.bancariaService.buscarPorNumero("0002");
//
//		System.out.println("saldo actual : " + cuentaActual1.getSaldo());
//		System.out.println("saldo actual : " + cuentaActual2.getSaldo());
//
//		System.out.println("reporte 1");
//		for (Transferencia t : this.itransferenciaService.BuscarReporte()) {
//			System.out.println(t);
//		}
//
//		this.itransferenciaService.realizar("0001", "0002", new BigDecimal(10));
//
//		System.out.println("reporte 2");
//		for (Transferencia t : this.itransferenciaService.BuscarReporte()) {
//			System.out.println(t);
//		}
//
//		System.out.println("saldos nuevos:");
//		CuentaBancaria cuentaConsultada1 = this.bancariaService.buscarPorNumero("0001");
//		CuentaBancaria cuentaConsultada2 = this.bancariaService.buscarPorNumero("0002");
//		
//
//		System.out.println("nuevo saldo: " + cuentaConsultada1.getSaldo());
//		System.out.println("nuevo saldo : " + cuentaConsultada2.getSaldo());
//		
//		System.out.println(cuentaConsultada1);
//		System.out.println(cuentaConsultada2);
//		

		
	}

}