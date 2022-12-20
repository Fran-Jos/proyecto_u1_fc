package com.example.demo.cita.repository;

import com.example.demo.cita.modelo.Medico;

public interface IMedicoRepository {

	public void insertar(Medico medico);

	public void eliminar(String cedula);

	public Medico buscar(String cedula);

}
