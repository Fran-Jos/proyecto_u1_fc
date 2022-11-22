package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFrameWork {
	public static void main(String[] args) {
		/*PacienteH pTerceraEdad = new PacienteTerceraEdadH();
		pTerceraEdad.setCedula("234242332");
		pTerceraEdad.setNombre("Aurelio");
		pTerceraEdad.setTipo("TE");
		*/
		MedicoH medico = new MedicoH();
		medico.setNombre("32323");
		medico.setNombre("Anddy");
		
		PacienteNinioH pTerceraEdad = new PacienteNinioH();
		pTerceraEdad.setCedula("234242332");
		pTerceraEdad.setNombre("Aurelio");
		pTerceraEdad.setTipo("TE");
	
		CitaMedicaH citaMedica = new CitaMedicaH();
		
		
		citaMedica.agendar("23232", LocalDateTime.of(2022,12,2,8,30), pTerceraEdad, medico);
	}
		
}
