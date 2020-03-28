package Logico;

import java.util.ArrayList;


public class Clinica {
	
	private ArrayList<Paciente> misPacientes;
	private ArrayList <Doctor> misDoctores;
	private ArrayList <consulta> misConsultas;
	private ArrayList <ControlEnfermedades> misEmfermedades;
	private ArrayList <ControlVacunacion> misVacunas;
	
	public Clinica() {
		super();
		this.misPacientes= new ArrayList <Paciente>();
		this.misDoctores= new ArrayList <Doctor>() ;
		this.misConsultas= new ArrayList <consulta> ();
		this.misEmfermedades= new ArrayList <ControlEnfermedades> ();
		this.misVacunas= new ArrayList <ControlVacunacion> ();
	}
	
	public void insertarVacunasbajovigilancia(ControlVacunacion aux){
		misVacunas.add(aux);
	}
	public void insertarDoctor(Doctor aux) {
		misDoctores.add(aux);
	}
	public void insertarEnfermedadBajoVigilancia(ControlEnfermedades aux) {
		misEmfermedades.add(aux);
	}
	public void insertarPaciente(Paciente aux) {
		misPacientes.add(aux);
	}
	public void insertarConsulta(consulta aux){
		misConsultas.add(aux);
	}
	
	public ArrayList<Paciente> getMisPacientes() {
		return misPacientes;
	}

	public void setMisPacientes(ArrayList<Paciente> misPacientes) {
		this.misPacientes = misPacientes;
	}

	public ArrayList<Doctor> getMisDoctores() {
		return misDoctores;
	}

	public void setMisDoctores(ArrayList<Doctor> misDoctores ) {
		this.misDoctores = misDoctores;
	}

	public ArrayList<consulta> getMisConsultas() {
		return misConsultas;
	}

	public void setMisConsultas(ArrayList<consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}


	public ArrayList<ControlVacunacion> getMisVacunas() {
		return misVacunas;
	}

	public void setMisVacunas(ArrayList<ControlVacunacion> misVacunas) {
		this.misVacunas = misVacunas;
	}

	public ArrayList <ControlEnfermedades> getMisEmfermedades() {
		return misEmfermedades;
	}

	public void setMisEmfermedades(ArrayList <ControlEnfermedades> misEmfermedades) {
		this.misEmfermedades = misEmfermedades;
	}
}
