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
import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.service.ICitaMedicaService;
import com.example.demo.hospital.service.IMedicoService;
import com.example.demo.hospital.service.IPacienteService;
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
//
//	@Autowired
//	private IVehiculoService iVehiculoService;
//	@Autowired
//	private IpropietarioService ipropietarioService;
//	
//	@Autowired
//	private IMatriculaService iMatriculaService;
	
	@Autowired
	private ICitaMedicaService icitaMedicaService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
    private IMedicoService iMedicoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Paciente p1 = new Paciente();
		p1.setCedula("17544068883");
		p1.setNombre("Gabriela Taco");
		p1.setTipo("Femenina");
		
		iPacienteService.crear(p1);
		
		System.out.println(p1);
		
		Medico medico = new Medico();
		medico.setCedula("214988783");
		medico.setNombre("Jose Mancheno");
		
		iMedicoService.crear(medico);
		
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setFechaAgenda(LocalDateTime.now());
		citaMedica.setFechaCita(LocalDateTime.now());
		citaMedica.setNumero("12313123");
		
		this.icitaMedicaService.agendar(medico, p1);
		
	

//	Vehiculo v = new Vehiculo();
//	
//	v.setMarca("Toyota");
//	v.setPlaca("asd");
//	v.setPrecio(new BigDecimal(20000));
//	v.setTipo("P");
//	
//	this.iVehiculoService.crear(v);
//	
//	v.setPrecio(new BigDecimal(10000));
//	v.setMarca("Chevrolet");
//	this.iVehiculoService.modificar(v);
//	
//	Propietario propietario = new Propietario();
//	propietario.setApellido("Taco");
//	propietario.setCedula("12");
//	propietario.setFechaNacimiento(LocalDateTime.of(1989, 7,7,12,35));
//	propietario.setNombre("Gabriela");
//	this.ipropietarioService.guardar(propietario);
//	
//	
//	this.iMatriculaService.matricular( "12","asd");
			
	
	
		
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