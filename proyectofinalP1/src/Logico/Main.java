package Logico;
public class Main {
	static Clinica clini = new Clinica();
	public static void main(String[] args) {	
		
		crearPaciente("12345678901","juan","peres","el real final calle 10","1234567890","juan@hfj.com","11","22","22");//ACÁ SE PASAN Y CREAN LOS DATOS PARA UN PACIENTE
		crearDoctor("12345678901","juan","peres","el real final calle 10","1234567890","juan@hfj.com","11","22","22");
		crearEnfermedad("covi19","lo que causa");
		crearVacuna("ebola","lol");
		crearConsulta("22","12345678901","12345678901");

}
	
//BASICAMENTE SE LE PASAN LOS PARAMETRO Y SI ESTOS SON VERDADEROS, SE PROCEDE A CREAR EL REGISTRO, SE DOCTOR O PACIENTE
//INGRESAR PACIENTE	
	public static boolean crearPaciente(String id,String nombre,String apellido,String direccion,String telefono,String correoElectronico,String fechaNacimiento,String sexo,String ocupacion){
		//String id limite de 11 digitos con guion automatizado a medida que se escribe, parte visual, pero se pasa aqui sin guion 
		//fecha CON 3 SPINNERS, antes de ingresar todo, no debe permitir que todo este vacio.		
		if (validarPersona(id,nombre,apellido,direccion,telefono,correoElectronico,fechaNacimiento,sexo,ocupacion)==false) {
			//se imprimiria que hay un dato errado
			return false; 
		}else {
			Paciente paci  = new Paciente(id,nombre,apellido,direccion,telefono,correoElectronico,fechaNacimiento,sexo,ocupacion);
			clini.insertarPaciente(paci);
			//si da true se
			return true;
		}
	}	
//INGRESAR DOCTOR
	public static boolean crearDoctor(String id,String nombre,String apellido,String direccion,String telefono,String correoElectronico,String fechaNacimiento ,String sexo,String especialidad){
		//String id limite de 11 digitos con guion automatizado a medida que se escribe, parte visual, pero se pasa aqui sin guion 
		//fecha de nacimiento = dia+"-"+mes+"-"ano
		//fecha CON 3 SPINNERS, antes de ingresar todo, no debe permitir que todo este vacio.		
		if (validarPersona(id,nombre,apellido,direccion,telefono,correoElectronico,fechaNacimiento,sexo,especialidad)==false) {
			//se imprimiria que hay un dato errado
			return false; 
		}else {
			Doctor doc  = new Doctor(id,nombre,apellido,direccion,telefono,correoElectronico,fechaNacimiento,sexo,especialidad);
			clini.insertarDoctor(doc);
			//si da true se
			return true;
		}
	}	
//VALIDAR PERSONA
	public static boolean validarPersona(String id, String nombre, String apellido, String direccion, String telefono,
			String correoElectronico, String fechaNacimiento, String sexo, String ocupacion) {
	//revisar formatos si se entraron correctamente
	//id o cedula
		
		if(!id.matches("[0-9]+") || id.length()!=11) {
			return false;
		}
		
		//nombre y apellido
		if(!nombre.matches("[a-zA-Z]+") || !nombre.matches("[a-zA-Z]+")) {
			return false;
		}
		
		//telefono
		if(!telefono.matches("[0-9]+") || id.length()!=10) {
			return false;
		}	
		if(!sexo.matches("[a-zA-Z]+")){
			return false;
		}
		return true;
		}
//INGRESAR ENFERMEDAD
	public static void crearEnfermedad(String nombreEnfermedad, String descripcionEnfermedad){
		ControlEnfermedades aux = new ControlEnfermedades(nombreEnfermedad, descripcionEnfermedad);
		clini.insertarEnfermedadBajoVigilancia(aux);	
	}	
//INGRESAR VACUNA
	public static void crearVacuna(String nombreVacuna, String descripcionVacuna){
		ControlVacunacion aux = new ControlVacunacion(nombreVacuna, descripcionVacuna);
		clini.insertarVacunasbajovigilancia(aux);
}		
//CREAR CONSULTA
	public static void crearConsulta(String fechaPautada,String idPaciente,String idDoctor) {
		consulta aux = new consulta(fechaPautada, idPaciente, idDoctor); //diagnostico, realizada o destacada no se marcan el crear porque no ha pasado
		clini.insertarConsulta(aux);	
		}
//
	
}
