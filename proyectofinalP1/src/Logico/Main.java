package Logico;

public class Main {
	static Clinica clini = new Clinica();
	
	
	public static void main(String[] args) {	
		
		crearPaciente("12345678901","juan","peres","el real final calle 10","1234567890","juan@hfj.com","11","22","22","masculino","trabajador");//ACÁ SE PASAN Y CREAN LOS DATOS PARA UN PACIENTE
		//DONDE SE PASAN LOS DATOS DE CREAR UN PACIENTE
		//true= se creal el paciente. false= Debe revisar los datos que entro, no se creo
	}
	
	
	public static boolean crearPaciente(String id,String nombre,String apellido,String direccion,String telefono,String email,String dia,String mes,String ano,String sexo,String ocupacion){
		//String id limite de 11 digitos con guion automatizado a medida que se escribe, parte visual, pero se pasa aqui sin guion 
		//fecha de nacimiento = dia+"-"+mes+"-"ano
		//fecha CON 3 SPINNERS, antes de ingresar todo, no debe permitir que todo este vacio.		
		String fechaNacimiento = dia+"-"+mes+"-"+ano;
		if (validarPersona(id,nombre,apellido,direccion,telefono,email,fechaNacimiento,sexo,ocupacion)==false) {
			//se imprimiria que hay un dato errado
			return false; 
		}else {
			Paciente paci  = new Paciente("123","jose","alcachofaz","su casita","123123321", "hcbeh@ceo.com","12-31-1998","masculino", "ninguna");
			clini.insertarPaciente(paci);
			//si da true se
			return true;
		}
	}
	private static boolean validarPersona(String id, String nombre, String apellido, String direccion, String telefono,
			String email, String fechaNacimiento, String sexo, String ocupacion) {
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
		//fechaNacimiento
		if(fechaNacimiento.length()<=2) { //vacio solo guiones
			return false;
		}
	
		if(!sexo.matches("[a-zA-Z]+")){
			return false;
		}
		return true;
		}

}
