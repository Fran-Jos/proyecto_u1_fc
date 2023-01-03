package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PacienteTerceraEdadH pacienteTE = new PacienteTerceraEdadH();
		pacienteTE.setCedula("123123");
		pacienteTE.setCodigoIESS("123123");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("TE");
		
		PacienteNinioH pacienteTE = new PacienteNinioH();
		pacienteTE.setCedula("123123");
		pacienteTE.setPesoNacimiento(8);
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("TE");
		*/
		PacienteCancerH pacienteTE = new PacienteCancerH();
		pacienteTE.setCedula("123123");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("C");
		
		MedicoH medico = new MedicoH();
		medico.setCedula("123123");
		medico.setNombre("Diana");
		
		CitaMedicaH cita= new CitaMedicaH();
		cita.agendar("123123", LocalDateTime.of(2022, 12, 2, 8, 30),pacienteTE, medico);
	}

}
