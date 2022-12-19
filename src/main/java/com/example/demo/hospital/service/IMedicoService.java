package com.example.demo.hospital.service;

import com.example.demo.hospital.modelo.Medico;

public interface IMedicoService {

	public void crear(Medico medico);
	public void borrar(String cedula);
	public Medico buscar(String cedula);
	public void actualizar(Medico medico);
	
}
