package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IpropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(cedula);
	}

}
