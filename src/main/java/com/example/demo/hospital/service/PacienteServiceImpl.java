package com.example.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	private IPacienteRepository iPacienteRepository;
	

	@Override
	public void crear(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.crear(paciente);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		Paciente paciente = null;
		
		if (this.iPacienteRepository.buscar(cedula) != null) {
			paciente = this.iPacienteRepository.buscar(cedula);
		}
		return paciente;
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

}
