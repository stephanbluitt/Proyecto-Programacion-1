package Logico;

public class Paciente extends Persona {

	private String Ocupacion;

	public Paciente(String id, String nombre, String apellido, String direccion, String telefono, String correoElectronico,
			String fechaNacimiento, String sexo, String ocupacion) {
		super(id, nombre, apellido, direccion, telefono, correoElectronico, fechaNacimiento, sexo);
		Ocupacion = ocupacion;
	}

	public String getOcupacion() {
		return Ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		Ocupacion = ocupacion;
	}
	
	
}
