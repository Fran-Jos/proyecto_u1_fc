package com.example.demo.hospital.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hospital.modelo.CitaMedica;


@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {

	private static List<CitaMedica> baseDeDatos = new ArrayList<>();
	
	@Override
	public CitaMedica buscar(String numero) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = null;
		
		for (CitaMedica cm : baseDeDatos) {
			if (cm.getNumero().equals(numero)) {
				
				citaMedica = cm;
			}
		}
		return citaMedica;
	}

	@Override
	public void agregar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		baseDeDatos.add(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		
		CitaMedica citaMedica1 = null;
		
		for (CitaMedica citaMedica2 : baseDeDatos) {
			if (citaMedica2.getNumero().equals(citaMedica.getNumero())) {
				citaMedica1 = citaMedica2;
			}
		}
		baseDeDatos.remove(citaMedica1);
		baseDeDatos.add(citaMedica);
		
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		baseDeDatos.remove(this.buscar(numero));
		
	}

}
