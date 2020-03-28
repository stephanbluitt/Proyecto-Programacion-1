package Logico;

public class consulta {

	private String fechaPautada;
	private String idPaciente;
	private String idDoctor;
	private String diagnostico;
	private boolean destacada;
	private boolean realizada;
	
	public consulta(String fechaPautada, String idPaciente, String idDoctor) {
		super();
		this.fechaPautada = fechaPautada;
		this.idPaciente = idPaciente;
		this.idDoctor = idDoctor;
	}

	public String getFechaPautada() {
		return fechaPautada;
	}

	public void setFechaPautada(String fechaPautada) {
		this.fechaPautada = fechaPautada;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(String idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public boolean isDestacada() {
		return destacada;
	}

	public void setDestacada(boolean destacada) {
		this.destacada = destacada;
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}


	
}
