package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ItransferenciaService {

	public List<Transferencia>BuscarReporte();
	public void realizar(String numeroOrigen , String numeroDestino , BigDecimal monto);
		
	//CRUD construir
	public Transferencia buscar (Integer id);
	
	public void actualizar(Transferencia transferencia);
	
	public void insertar(Transferencia transferencia);
	
	public void borrar(Integer id);


}
