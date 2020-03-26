package Logico;

public class ControlEnfermedades {

	private String nombreEnfermedad;
	private String descripcionEnfermedad;
	
	public ControlEnfermedades(String nombreEnfermedad, String descripcionEnfermedad) {
		super();
		this.nombreEnfermedad = nombreEnfermedad;
		this.descripcionEnfermedad = descripcionEnfermedad;
	}
	public String getNombreEnfermedad() {
		return nombreEnfermedad;
	}
	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}
	public String getDescripcionEnfermedad() {
		return descripcionEnfermedad;
	}
	public void setDescripcionEnfermedad(String descripcionEnfermedad) {
		this.descripcionEnfermedad = descripcionEnfermedad;
	}
	
	
}
