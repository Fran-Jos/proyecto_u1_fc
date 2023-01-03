package com.example.demo.cita.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {

	private static List<CitaMedica> base = new ArrayList<>();

	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		base.add(citaMedica);
	}

}
