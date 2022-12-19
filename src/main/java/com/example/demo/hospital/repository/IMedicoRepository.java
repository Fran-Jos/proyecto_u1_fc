package com.example.demo.hospital.repository;

import com.example.demo.hospital.modelo.Medico;

public interface IMedicoRepository {

	public void crear(Medico medico);
	public void borrar(String cedula);
	public Medico buscar(String cedula);
	public void actualizar(Medico medico);
}
