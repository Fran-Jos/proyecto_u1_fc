package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Transferencia;

public interface ItransferenciaRepository {
	
	//CRUD ----> siempre vamos a crear el crud
	public Transferencia buscar(Integer id);
	//
	public void actualizar(Transferencia transferencia);
	public void insertar(Transferencia transferencia);
	public void borrar(Integer id);
}
