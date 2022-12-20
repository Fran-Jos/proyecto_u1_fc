package com.example.demo.springboot;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class CitaMedicaSB {
	private String numero;
	private LocalDateTime fechaCita, fechaAgenda;
	private MedicoSB medico;
	private PacienteSB paciente;

	public void agendar(String numero, LocalDateTime fechaCita,PacienteSB ph, MedicoSB mh) {
		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();
		this.paciente = ph;
		
		Integer valorDescuento = ph.calcularDescuento();
		System.out.println("Valor: " + valorDescuento);

		this.medico = mh;
		this.guardarCita(this);
	}

	private void guardarCita(CitaMedicaSB cita) {
		// funcion INSERT
		System.out.println("Se ha agendado la cita: ");
		System.out.println(cita);

	}

	// GETTER & SETTER
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public MedicoSB getMedico() {
		return medico;
	}

	public void setMedico(MedicoSB medico) {
		this.medico = medico;
	}

	public PacienteSB getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteSB paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "CitaMedicaH [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}
	
	
}
