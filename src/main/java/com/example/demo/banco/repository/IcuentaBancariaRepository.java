package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface IcuentaBancariaRepository {

	//
	public CuentaBancaria buscarPorNumero(String numeroCuenta);
	
	//public void actualizar(CuentaBancaria cuentaBancaria);
	
	//CRUD ----> siempre vamos a crear el crud
	public CuentaBancaria  buscar(Integer id);
	//
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	
}
