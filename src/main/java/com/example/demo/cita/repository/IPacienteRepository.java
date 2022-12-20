package com.example.demo.cita.repository;

import com.example.demo.cita.modelo.Paciente;

public interface IPacienteRepository {

	// CRUD
	public void insertar(Paciente paciente);

	public Paciente buscar(String cedula);

	public void actualizar(Paciente paciente);

	public void eliminar(String cedula);
}
