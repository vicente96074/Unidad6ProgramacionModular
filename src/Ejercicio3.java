//Unidad6ProgramacionModular
package src;
import java.util.Scanner;

public class Ejercicio3{
	
	public Ejercicio3(){
		iniciarComponentes();
	}
	
	private void iniciarComponentes(){
		boolean encontrado;
		System.out.print("Ingrese un numero a buscar: ");
		encontrado = buscarNumero(entrada.nextInt());
		
		if(encontrado){
			System.out.println("Numero encontrado");
		} else{
			System.out.println("Numero no encontrado");			
		} 
	}
	
	//Funcion para buscar un numero
	private boolean buscarNumero(int numero){
		for(int i=0; i<arregloNumeros.length; i++){
			if(numero == arregloNumeros[i]){
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args){
		Ejercicio3 ejercicio3 = new Ejercicio3();
	}
	
	int[] arregloNumeros = {5,3,7,9,1,10,4,2};
	Scanner entrada = new Scanner(System.in);
}
