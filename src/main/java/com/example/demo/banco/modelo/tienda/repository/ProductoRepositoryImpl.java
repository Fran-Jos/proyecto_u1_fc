package com.example.demo.banco.modelo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.tienda.modelo.Producto;

public class ProductoRepositoryImpl implements IProductoRepository {

	private static List<Producto> baseDeDatos = new ArrayList<>();
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		baseDeDatos.add(producto);
	}

}
