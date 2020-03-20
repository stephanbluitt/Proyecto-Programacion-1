package Logico;

public class consulta {

	private String fechaPautada;
	private int idPaciente;
	private int IdDoctor;
	private String diagnostico;
	private boolean destacada;
	private boolean realizada;
	
	public consulta(String fechaPautada, int idPaciente, int idDoctor, String diagnostico, boolean destacada,
			boolean realizada) {
		super();
		this.fechaPautada = fechaPautada;
		this.idPaciente = idPaciente;
		IdDoctor = idDoctor;
		this.diagnostico = diagnostico;
		this.destacada = destacada;
		this.realizada = realizada;
	}

	public String getFechaPautada() {
		return fechaPautada;
	}

	public void setFechaPautada(String fechaPautada) {
		this.fechaPautada = fechaPautada;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getIdDoctor() {
		return IdDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		IdDoctor = idDoctor;
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
