
public class UsuarioAdmin {

	
	public void Mostrar(Usuario modelo){
		System.out.println("Nombre: 	"	+modelo.getNombre());
		System.out.println("Apellido: 	"	+modelo.getApellido());
		System.out.println("Edad: 		" 	+modelo.getEdad());
		System.out.println("Cargo: 		" 	+modelo.getCargo());
		
		switch (modelo.getCargo() ){
		case 'a':
			System.out.println("Es el jefe");
			break;
		case 'b':
			System.out.println("Es el empleado");
			break;			
		default:
		    System.out.println("No trabaja en la empresa");
			break;		
			
		}
		
	}
}
