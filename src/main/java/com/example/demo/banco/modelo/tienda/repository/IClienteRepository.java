package com.example.demo.banco.modelo.tienda.repository;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteRepository {

	
	public void insertar (Cliente cliente);
	
	public void actualizar(Cliente cliente );
	
	//elimanar y buscar siempre con un identifiador
	public Cliente buscar (String cedula);
	
	public void eliminar(String cedula);
}
