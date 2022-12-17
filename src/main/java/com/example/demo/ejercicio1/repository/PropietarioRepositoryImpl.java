package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	private static List<Propietario> base = new ArrayList<>();
	
	public  Propietario buscar(String cedula) {
		Propietario pr = null;
		for(Propietario p: base) {
			if(p.getCedula().equals(cedula)) {
				pr= p;
			}
			
		}
		return pr;
	}
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.base.add(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.base.remove(this.buscar(cedula));
	}

}
