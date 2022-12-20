package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	private static List<Cliente> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el cliente: " + cliente);
		baseDatos.add(cliente);

	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente cli = null;
		for (Cliente c : baseDatos) {
			if (c.getCedula().equals(cliente.getCedula())) {
				cli = c;
			}
			baseDatos.remove(cli);
			baseDatos.add(cliente);
		}
		System.out.println("Se actualiza la cuenta: " + cliente);

	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cli = null;
		for (Cliente c : baseDatos) {
			if (c.getCedula().equals(cedula)) {
				cli = c;
			}
		}
		return cli;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cli = buscar(cedula);
		baseDatos.remove(cli);
	}

}
