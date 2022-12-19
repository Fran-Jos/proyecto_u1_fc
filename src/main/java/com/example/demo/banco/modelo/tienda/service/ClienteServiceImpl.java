package com.example.demo.banco.modelo.tienda.service;

import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.tienda.repository.IClienteRepository;
import com.example.demo.tienda.modelo.Cliente;
@Service
public class ClienteServiceImpl implements IClienteService {

	private IClienteRepository clienteRepository;

	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		
		this.clienteRepository.insertar(cliente);
		
	}
	
}
