package com.example.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.CitaMedica;
import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.repository.ICitaMedicaRepository;
import com.example.demo.hospital.repository.IMedicoRepository;
import com.example.demo.hospital.repository.IPacienteRepository;
import com.example.demo.tienda.modelo.Cliente;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	@Autowired
	private IPacienteRepository iPacienteRepository;
	@Autowired
	private IMedicoRepository iMedicoRepository;
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	
//	@Override
//	public void agendar(CitaMedica cita) {
//		// TODO Auto-generated method stub
//		//Paciente p = null;
//	    //Medico m = null;
//		CitaMedica citaMedica = null;
//		
//		if (this.iPacienteRepository.buscar(cita.getPaciente().getCedula()) != null && 
//				this.iMedicoRepository.buscar(cita.getMedico().getCedula())!= null) {
//			System.out.println("Agendando: ");
//			
//			citaMedica.getFechaAgenda();
//			citaMedica.getFechaCita();
//			citaMedica.getMedico();
//			citaMedica.getNumero();
//			citaMedica.getPaciente();
//			
//			this.citaMedicaRepository.agregar(citaMedica);
//			
//			
//			
//			
//		} else {
//			System.out.println("verifique la existencia de Paciente o Medico");
//			System.out.println("Agendación no generada");
//
//		}
//		
//		
//		
//	}

	@Override
	public void agendar(Medico medico,Paciente paciente ) {
		// TODO Auto-generated method stub
		//Paciente p = this.iPacienteRepository.;
	    //Medico m = null;
		CitaMedica citaMedica = null;
		
		if (this.iPacienteRepository.buscar(paciente.getCedula()) != null && 
				this.iMedicoRepository.buscar(medico.getCedula())!= null) {
			System.out.println("Agendando: ");
			
			citaMedica.getFechaAgenda();
			citaMedica.getFechaCita();
			citaMedica.getMedico();
			citaMedica.getNumero();
			citaMedica.getPaciente();
			
			this.citaMedicaRepository.agregar(citaMedica);
			
			
			
			
		} else {
			System.out.println("verifique la existencia de Paciente o Medico");
			System.out.println("Agendación no generada");

		}
		
		
		
	}
	@Override
	public CitaMedica buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		
	}

}
