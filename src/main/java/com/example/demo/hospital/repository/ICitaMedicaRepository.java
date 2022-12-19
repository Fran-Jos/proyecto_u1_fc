package com.example.demo.hospital.repository;

import com.example.demo.hospital.modelo.CitaMedica;
import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;

public interface ICitaMedicaRepository {

	public CitaMedica buscar(String numero);
	public void agregar(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public void borrar(String numero);
	
}
