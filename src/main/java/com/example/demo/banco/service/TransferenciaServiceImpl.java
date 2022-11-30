package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ItransferenciaRepository;



@Service
public class TransferenciaServiceImpl  implements ItransferenciaService{

	@Autowired
	private ItransferenciaRepository itransferenciaRepository;
	@Autowired
	private IcuentaBancariaService bancariaService;
	
	
	
	@Override
	public List<Transferencia> BuscarReporte() {
		// TODO Auto-generated method stub
		return this.itransferenciaRepository.buscarTodos();
	}

	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		//ORIGEN
		//paso1 : buscar la cuenta origen.
		CuentaBancaria origen = this.bancariaService.buscarPorNumero(numeroOrigen);
		//paso2 : consultar el saldo de la cuenta origen.
		BigDecimal saldoOrigen =  origen.getSaldo();
		//paso3 : operación resta en el origen. 
		//saldo = saldoOrigen - monto
		BigDecimal Nuevosaldo=  saldoOrigen.subtract(monto);
		//paso4 : Actualización cuenta origen.
		origen.setSaldo(Nuevosaldo);
		this.bancariaService.actualizar(origen);
		
		//DESTINO
		//paso1 : buscar la cuenta destino.
		CuentaBancaria destino = this.bancariaService.buscarPorNumero(numeroDestino);
		//paso2 : consultar el saldo de la cuenta destino.
		BigDecimal saldoDestino = destino.getSaldo();
		//paso3 : operación suma en el destino.
		BigDecimal NuevoSaldoDestino = saldoDestino.add(monto);
		//paso4 : Actualización cuenta destina.
		destino.setSaldo(NuevoSaldoDestino);
		this.bancariaService.actualizar(destino);
		
	}

}