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
import com.example.demo.hospital.modelo.CitaMedica;
import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.service.ICitaMedicaService;
import com.example.demo.hospital.service.IMedicoService;
import com.example.demo.hospital.service.IPacienteService;
import com.example.demo.spring.CitaMedicaSB;
import com.example.demo.spring.MedicoSB;
import com.example.demo.spring.PacienteCancerSB;
import com.example.demo.spring.PacienteTerceraEdadSB;
import com.example.demo.hospital.*;
import com.example.demo.tradicional.PacienteTerceraEdad;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	
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
		citaMedica.setPaciente(p1);
		citaMedica.setMedico(medico);
		
		this.icitaMedicaService.agendar("214988783" , "17544068883");
		
		System.out.println(citaMedica);
	}

}