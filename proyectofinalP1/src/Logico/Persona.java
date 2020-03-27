package Logico;

public abstract class Persona {
	
	protected String id; //cedula
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected String telefono;
	protected String correoElectronico;
	protected String fechadenacimiento;
	protected String sexo;
	public Persona(String id, String nombre, String apellido, String direccion, String telefono, String correoElectronico,
			String fechadenacimiento, String sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.fechadenacimiento = fechadenacimiento;
		this.sexo = sexo;
	}
	public String getid() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getFechadenacimiento() {
		return fechadenacimiento;
	}
	public void setFechadenacimiento(String fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
