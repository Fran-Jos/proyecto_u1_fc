package com.example.demo.hospital.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;

@Repository
public class PacienteRepositoryImpl implements IPacienteRepository {
	
	private static List<Paciente> baseDeDatos = new ArrayList<>();
	
	@Override
	public void crear(Paciente paciente) {
		// TODO Auto-generated method stub
		baseDeDatos.add(paciente);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		baseDeDatos.remove(this.buscar(cedula));
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		Paciente paciente = null;
		
		for (Paciente paciente1 : baseDeDatos) {
			if (paciente1.getCedula().equals(cedula)) {
				paciente = paciente1;
			}
		}
		return paciente;
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
	Paciente paciente0 = null;
		
		for (Paciente paciente1 : baseDeDatos) {
			if (paciente1.getCedula().equals(paciente.getCedula())) {
				paciente0 = paciente1;
			}
		}
		baseDeDatos.remove(paciente0);
		baseDeDatos.add(paciente);
		
		
	}


}
