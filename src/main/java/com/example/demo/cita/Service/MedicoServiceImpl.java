package com.example.demo.cita.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.Medico;
import com.example.demo.cita.repository.IMedicoRepository;

@Service
public class MedicoServiceImpl implements IMedicoService {

	@Autowired
	private IMedicoRepository medicoRepository;

	@Override
	public void agregar(Medico medico) {
		// TODO Auto-generated method stub
		this.medicoRepository.insertar(medico);
	}

	@Override
	public void remover(String cedula) {
		// TODO Auto-generated method stub
		this.medicoRepository.eliminar(cedula);
	}

}
