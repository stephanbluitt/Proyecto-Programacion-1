package Logico;

import java.util.ArrayList;

public class Clinica {
	
	private ArrayList<Doctor> misDoctores;
	private ArrayList<Paciente> misPacientes;
	private ArrayList<ControlEnfermedades> misEnfermedades;
	private ArrayList<ControlVacunacion> misVacunas;
	private ArrayList<consulta> misConsultas;	
	
	public void insertarDoctor(Doctor aux) {
		misDoctores.add(aux);
	}
	public void insertarPaciente(Paciente aux) {
		misPacientes.add(aux);
	}
	public void insertarVacunasbajovigilancia(ControlVacunacion aux){
		misVacunas.add(aux);
	}
	public void insertarEnfermedadBajoVigilancia(ControlEnfermedades aux) {
		misEnfermedades.add(aux);
	}
	public void insertarConsulta(consulta aux){
		misConsultas.add(aux);
	}
	
}