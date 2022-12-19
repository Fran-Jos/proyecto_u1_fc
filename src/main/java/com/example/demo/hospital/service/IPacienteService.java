package com.example.demo.hospital.service;

import com.example.demo.hospital.modelo.Paciente;

public interface IPacienteService {
	
	public void crear(Paciente paciente);
	public void borrar(String cedula);
	public Paciente buscar(String cedula);
	public void actualizar(Paciente paciente);

}
