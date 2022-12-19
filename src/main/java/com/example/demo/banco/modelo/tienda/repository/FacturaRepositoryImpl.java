package com.example.demo.banco.modelo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.tienda.modelo.Factura;

public class FacturaRepositoryImpl implements IFacturaRepository{

	private static List<Factura> baseDeDatos = new ArrayList<>();
	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		baseDeDatos.add(factura);
	}
}
