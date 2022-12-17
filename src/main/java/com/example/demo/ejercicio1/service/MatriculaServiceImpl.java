package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl  implements IMatriculaService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	private IMatriculaRepository iMatriculaRepository ;
	
	private IPropietarioRepository iPropietarioRepository;
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		Propietario propietario = this.iPropietarioRepository.buscar(cedula);
		
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);
		
		BigDecimal valor = null;
		
		if (vehiculo.getTipo().equals("P")) {
			valor =vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		}else {
			//iviano
			valor =vehiculo.getPrecio().multiply(new BigDecimal(0.10));
			
		}
		
		if (valor.compareTo(new BigDecimal(2000))>1) {
			
		BigDecimal descuento = valor.multiply(new BigDecimal(7));
		descuento = descuento.divide(new BigDecimal(100));
		valor = valor.subtract(descuento);
		
		}
		matricula.setValor(valor);
		
		this.iMatriculaRepository.insertar(matricula);
		
		
		
			
		}

}
