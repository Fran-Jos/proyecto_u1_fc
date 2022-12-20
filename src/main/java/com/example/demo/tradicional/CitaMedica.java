package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {

	private String numero;
	private LocalDateTime fechaCita, fechaAgenda;
	private Medico medico;
	private Paciente paciente;

	//Comentario taller 4

	void agendar(String numero, LocalDateTime fechac, String nombreMed, String cedMed, String nombrePaciente,
			String cedulaPaciente, String tipo) {

		this.numero = numero;
		this.fechaCita = fechac;
		this.fechaAgenda = LocalDateTime.now();

		Medico medico = new Medico();
		medico.setCedula(cedMed);
		medico.setNombre(nombreMed);
		this.medico = medico;

		// Tercera edada TE niño es N
		if (tipo.equals("TE")) {
			PacienteTerceraEdad pacienteTE = new PacienteTerceraEdad();
			pacienteTE.setCodigoIESS("12432");
			pacienteTE.setTipo("TE");

			this.paciente = pacienteTE;
			
		System.out.println("Paciente con descuento");	
		if(tipo.equals("N")) {
			PacienteNinio pacienteNinio = new PacienteNinio();
			pacienteNinio.setPesoNacimiento(5);
			pacienteNinio.setTipo("N");

			this.paciente = pacienteNinio;
			System.out.println("Paciente Ninio sin descuento");	
		}
		} else {
			PacienteCancer pc = new PacienteCancer();
			this.paciente = pc;
			
			System.out.println("Paciente Cancer sin descuento");	

		}

		this.paciente.setCedula(cedulaPaciente);
		this.paciente.setNombre(nombrePaciente);
		this.guardarCita(this);

	}

	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}

	private void guardarCita(CitaMedica cita) {
		// funcion INSERT
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

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
