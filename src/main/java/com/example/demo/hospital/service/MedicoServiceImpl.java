package com.example.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.repository.IMedicoRepository;

@Service
public class MedicoServiceImpl implements IMedicoService {
	
	@Autowired
	private IMedicoRepository iMedicoRepository;

	@Override
	public void crear(Medico medico) {
		// TODO Auto-generated method stub
		this.iMedicoRepository.crear(medico);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Medico buscar(String cedula) {
		// TODO Auto-generated method stub
		Medico medico = null;
		
		if (this.iMedicoRepository.buscar(cedula) != null) {
			medico = this.iMedicoRepository.buscar(cedula);
		}
		return medico;
	}

	@Override
	public void actualizar(Medico medico) {
		// TODO Auto-generated method stub
		
	}

}
