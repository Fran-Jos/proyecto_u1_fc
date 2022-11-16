package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paciente;
	//este tipo de programacion se dice que es fuertemente acoplado
	public void agendar(String numero, LocalDateTime fechaCita, String nombreMed, String cedulaMed,
			String nombrePac, String cedulaPac , String tipo) {
		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();
		// gestion de mis dependecias 
		Medico medico = new Medico(); // creo una instacia de la clase paciente 
		medico.setCedula(cedulaMed);
		medico.setNombre(nombreMed);
		//cita medica gestiona tanto a medico y paciente 
		this.medico = medico;
		
		//Tercera edad TE , ninio N
		if (tipo.equals("TE")) {
			PacienteTerceraEdad pacienteTerceraEdad = new PacienteTerceraEdad();
			pacienteTerceraEdad.setIess("234234234");
			pacienteTerceraEdad.setTipo("TE");
			System.out.println("paciente con descuento");
			
			this.paciente = pacienteTerceraEdad;
		}else {
			PacienteNinio pacienteNinio = new PacienteNinio();
			pacienteNinio.setPesoNacimiento(3);
			pacienteNinio.setTipo("N");
			System.out.println("paciente (N) sin descuento");
		}
		
		
		//Paciente paciente = new Paciente();
		this.paciente.setCedula(cedulaPac);
		this.paciente.setNombre(nombrePac);
		
		//this.paciente = paciente;
		
		this.guardarCita(this);
		
	}
	
	private void guardarCita(CitaMedica cita){
		// insertar los datos del programa 
		System.out.println("se agendo la cita");
		System.out.println(cita);
	}
	
	
	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + ", getNumero()=" + getNumero() + ", getFechaCita()="
				+ getFechaCita() + ", getFechaAgenda()=" + getFechaAgenda() + ", getMedico()=" + getMedico()
				+ ", getPaciente()=" + getPaciente() + "]";
	}

	//set y get	
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
