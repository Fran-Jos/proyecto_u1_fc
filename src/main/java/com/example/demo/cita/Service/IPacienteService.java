package com.example.demo.cita.Service;

import com.example.demo.cita.modelo.Paciente;

public interface IPacienteService {

	public void guardar(Paciente paciente);

	public void modificar(Paciente paciente);

	public Paciente buscar(String cedula);

	public void quitar(String cedula);

}
