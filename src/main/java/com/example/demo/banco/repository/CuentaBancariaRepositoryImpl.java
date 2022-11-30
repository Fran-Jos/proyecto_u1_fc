package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
@Repository
public class CuentaBancariaRepositoryImpl implements IcuentaBancariaRepository {

	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	
	// aqui solo debe de estar el acceso a la base de datos
	//no crea nada aqui
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {  
		// TODO Auto-generated method stub
		// SELECT * FROM CUENTA C WHERE C.NUMERO = numeroCuenta
		
		/*CuentaBancaria cuenta  = new CuentaBancaria();
		cuenta.setNumero(numeroCuenta);
		cuenta.setSaldo(new BigDecimal(100));
		cuenta.setTipo("A");
		cuenta.setTitular("Francisco");
		*/
		CuentaBancaria cuenta = null;
		
		for (CuentaBancaria cuentaBancaria : baseCuentas) {
			if (cuentaBancaria.getNumero().equals(numeroCuenta)) {
				cuenta = cuentaBancaria;
			}
		}
		
		System.out.println("se busca la cuenta: " +numeroCuenta);
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("se busca la cuenta:" + id);
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		System.out.println("se actualiza la cuenta :" + cuentaBancaria);
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		
		System.out.println("Se inserta la cuenta bancaria");
		System.out.println(cuentaBancaria);
		baseCuentas.add(cuentaBancaria);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se borra la cuenta bancaria: " + id );
		
	}

}
