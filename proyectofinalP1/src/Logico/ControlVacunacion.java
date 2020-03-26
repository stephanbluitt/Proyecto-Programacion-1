package Logico;

public class ControlVacunacion {
	private String vacuna;
	private String descripcion;
	
	public ControlVacunacion(String vacuna, String descripcion) {
		super();
		this.vacuna = vacuna;
		this.descripcion = descripcion;
	}
	public String getVacuna() {
		return vacuna;
	}
	public void setVacuna(String vacuna) {
		this.vacuna = vacuna;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
