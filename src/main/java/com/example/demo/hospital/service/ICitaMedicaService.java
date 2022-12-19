package com.example.demo.hospital.service;

import com.example.demo.hospital.modelo.CitaMedica;
import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;


public interface ICitaMedicaService {

	//public void agendar(CitaMedica citaMedica);
	public void agendar(String cedulaM , String cedulaP);
	public CitaMedica buscar(String numero);
	public void actualizar(CitaMedica citaMedica);
	public void borrar(String numero);
}
