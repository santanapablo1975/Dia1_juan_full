
public class Usuario {
	
	//constructores
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Usuario(String nombre, String apellido, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}

	
	private String nombre;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	private String apellido;
	private int edad;
		
	private char cargo;
	public char getCargo() {
		return cargo;
	}



	public void setCargo(char cargo) {
		this.cargo = cargo;
	}

}
