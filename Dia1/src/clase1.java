import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clase1 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub

		//imprimir algo en cosnola
	System.out.println("Dia1 curso JAVA test, escriba en consola \n"); 
	
	//capturar consola caracteres
	Scanner leer=new Scanner(System.in);
	
	String palabra=leer.nextLine();
	
	System.out.println("la palabra es: " + palabra + "\n");
	
	//capturar consola numeros para operadores
	
	System.out.println("\n escriba un numero 1");	
	int numero1=leer.nextInt();
	System.out.println("\n escriba un numero 2");
	int numero2=leer.nextInt();
	
	System.out.println("el numero es 1 y 2: " + numero1 + "  " + numero2 + "\n");
	
*/
		//llamar a metodo
		
		//MostrarPalabra();
		//MostrarPalabra();
		//CicloFor();
		//CicloWhile();
		//CicloDoWhile();
		//Menu();
		//Arreglo();
		//LlenarMatrix();
		//LlenarMatrixMano();
		//Lista();
		ListaUsuario();
		
		
		
	}
		
	
	/*
	private static void MostrarPalabra() {
		// TODO Auto-generated method stub

				//imprimir algo en cosnola
			System.out.println("Dia1 curso JAVA test, escriba en consola \n"); 
			
			//capturar consola caracteres
			Scanner leer=new Scanner(System.in);
			
			String palabra=leer.nextLine();
			
			System.out.println("la palabra es: " + palabra + "\n");
			
			//capturar consola numeros para operadores
			
			System.out.println("\n escriba un numero 1");	
			int numero1=leer.nextInt();
			System.out.println("\n escriba un numero 2");
			int numero2=leer.nextInt();
			
			System.out.println("el numero es 1 y 2: " + numero1 + "  " + numero2 + "\n");
		
		
	}*/

	
	private static void MostrarPalabra() {
			
			//capturar consola caracteres
			Scanner leer=new Scanner(System.in);
			Usuario modelo=new Usuario();
			
			UsuarioAdmin admin=new UsuarioAdmin();
			
			System.out.println("Escriba el Nombre");
			modelo.setNombre(leer.nextLine());
			System.out.println("Escriba el Apellido");
			modelo.setApellido(leer.nextLine());
			System.out.println("Escriba la Edad");
			modelo.setEdad(leer.nextInt());
			System.out.println("Escriba el cargo");
			modelo.setCargo(leer.next().charAt(0));
				
			
			
			admin.Mostrar(modelo);
			leer.close();
			
		
		
	}
	
	//ciclos
	private static void CicloFor() {
		for (int i = 0; i <= 10; i=i +2) {
			System.out.print(i + " ");
		}
	}
	
	
	private static void CicloWhile() {
		int contador=0;
		while (contador<10) {
			System.out.println(contador);
			contador++;			
		}
	}
		
	private static void CicloDoWhile() {
		int contador = 3;
		do {
			System.out.println(contador);
			contador++;
		} while (contador<10);
	}
	
	
	private static void Menu(){
		Scanner leer=new Scanner(System.in);
		char opcion=' ';
		
		do {
			System.out.println("Digitexxx la palabra");
			String palabra=leer.nextLine();
			System.out.println("La palabra es:" + palabra);
			System.out.println("Digite otra palabra s o n");
		opcion=leer.nextLine().charAt(0);
			
		} while (opcion=='s' || opcion =='S');
	
	}


	private static void Arreglo() {
		
		int size = 9;
		int arreglo1[]=new int[size];
		int arreglo2[]=new int[size];
		int arreglo3[]=new int[size];
		int arreglo4[]=new int[size];
				
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i]=i;
			arreglo2[(arreglo1.length-1) - i]=arreglo1[i];
			arreglo3[i] = arreglo1[i]*arreglo1[i];
			arreglo4[i] = arreglo1[i]*arreglo2[(arreglo1.length-1) - i];
		}
		
		for (int i = 0; i < arreglo1.length; i++) {
			//System.out.println("el valor en " + i + " es " + arreglo1[i] );
			//System.out.println("el valor en " + i + " es " + arreglo2[i]);
			//System.out.println("el valor en " + i + " es " + arreglo3[i]);
			
			//System.out.println("el valor en " + i + " es " + arreglo1[i] + " " + arreglo2[i] + " " + arreglo3[i] + " ");
			
			//System.out.println("pos " + i + " tiene ar1 " + arreglo1[i] + " tiene ar2 " +arreglo2[i] + " tiene ar3 " + arreglo3[i]);
			
			System.out.println( i + " " + arreglo1[i] + " " + arreglo2[i] + " " + arreglo3[i] + " " + arreglo4[i]);
			
			
		}
	
	
	
	}
	
	
	private static void LlenarMatrix(){
		int size_i = 3;
		int size_j = 3;
		
		int matrix[][]=new int[size_i][size_j];
		
		//for (int i = 0; i < matrix.length; i++) {
		
		System.out.println("test " + matrix.length);
		for (int i = 0; i < size_i; i++) {
			for (int j = 0; j < size_j; j++) {
				matrix[i][j]=i;				
			}
		}
			for (int i = 0; i < size_i; i++) {
				for (int j = 0; j < size_j; j++) {
				System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			
		}
				
		
	}
	
	private static void LlenarMatrixMano(){
		int size_i = 3;
		int size_j = 4;
		
		int matrix[][]=new int[size_i][size_j];
		
		int contador = 0; 
		
		//for (int i = 0; i < matrix.length; i++) {
		
		System.out.println("test " + matrix.length);
		
		for (int i = 0; i < size_i; i++) {
			for (int j = 0; j < size_j; j++) {
				contador++;
				matrix[i][j]=contador;				
			}
			
			
			
		}
			for (int i = 0; i < size_i; i++) {
				for (int j = 0; j < size_j; j++) {
				System.out.println(i+","+j+" = "+matrix[i][j]);
				}
				
			
		}
				
		
	}
	
	
	private static void Lista() {
		List<String>listas=new ArrayList<>(); //creacion de listas
		/*
		String palabra = "java";
		listas.add(palabra);
		
		String palabra2 = "java2";
		listas.add(palabra2);
		*/
		
		for (int i = 0; i < 10; i++) {
			listas.add("palabra " + i);
			
		}
		
		
		//listas.add(0, "Edwin");
		//listas.remove(1);
		
		for (String item : listas) {
			
			System.out.println(item);
		}
	}
	
	private static void ListaUsuario () {
		List<Usuario>lista=new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Usuario modelo=new Usuario();
			modelo.setNombre("nombre " + i); 
			modelo.setApellido("apellido " + i);
			modelo.setEdad(i);
			modelo.setCargo('a');
			
			lista.add(modelo);
			
			}
		
		
		for (Usuario item : lista) {
			System.out.println(item.getNombre());
			System.out.println(item.getApellido());
			System.out.println(item.getEdad());
			System.out.println(item.getCargo());
			System.out.println("----------------------------------");
			
			
		}
			
		}
	
	
	

//end
}




	



