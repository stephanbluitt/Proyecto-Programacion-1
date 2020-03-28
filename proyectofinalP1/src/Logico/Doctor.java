package Logico;

public class Doctor extends Persona {

	protected String Especialidad;

	public Doctor(String id, String nombre, String apellido, String direccion, String telefono,
			String correoElectronico, String fechaNacimiento, String sexo, String especialidad) {
		super(id, nombre, apellido, direccion, telefono, correoElectronico, fechaNacimiento, sexo);
		Especialidad = especialidad;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}


	
	
}
