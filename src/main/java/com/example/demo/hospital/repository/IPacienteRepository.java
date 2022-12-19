package com.example.demo.hospital.repository;

import com.example.demo.hospital.modelo.Paciente;

public interface IPacienteRepository {

	public void crear(Paciente paciente);
	public void borrar(String cedula);
	public Paciente buscar(String cedula);
	public void actualizar(Paciente paciente);
	
}
