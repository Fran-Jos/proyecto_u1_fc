package com.example.demo.cita.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.CitaMedica;
import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.repository.ICitaMedicaRepository;
import com.example.demo.cita.repository.IMedicoRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	@Autowired
	private IMedicoRepository medicoRepository;
	@Autowired
	private IPacienteService pacienteService;

	@Override
	public void agendar(String cedulaPaciente, String cedulaMedico, LocalDateTime fechaCita) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setFechaAgenda(LocalDateTime.now());
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setNumero("1");
		citaMedica.setMedico(this.medicoRepository.buscar(cedulaMedico));

		Paciente paciente = this.pacienteService.buscar(cedulaPaciente);
		citaMedica.setPaciente(paciente);

		BigDecimal valor = new BigDecimal(20);
		if (paciente.getTipo() == "N") {
			valor = valor.subtract(new BigDecimal(0.10)); // 10% de descuento por ser ninio
		}
		citaMedica.setValor(valor);
		this.citaMedicaRepository.insertar(citaMedica);
	}

}
