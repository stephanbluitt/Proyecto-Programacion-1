package Logico;

import java.util.ArrayList;

public class Clinica {
	
	public ArrayList<Doctor> misDoctores;
	public ArrayList<Paciente> misPacientes;
	
	public void insertarDoctor(Doctor aux) {
		misDoctores.add(aux);
	}
	public void insertarPaciente(Paciente aux) {
		misPacientes.add(aux);
	}
}
