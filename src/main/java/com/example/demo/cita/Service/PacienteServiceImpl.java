package com.example.demo.cita.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepository pacienteRepository;	
	@Override
	public void guardar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public void modificar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscar(cedula);
	}

	@Override
	public void quitar(String cedula) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(cedula);
	}

}
