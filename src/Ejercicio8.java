//Unidad6ProgramacionModular
package src;
import java.util.Scanner;

public class Ejercicio8{
	
	//Metodo constructor
	public Ejercicio8(){
		iniciarComponentes();
	}
	
	//Para inicar los demas metodos de la clase
	private void iniciarComponentes(){
		llenarArreglos();
		compararArreglos();
	}
	
	//Llenar arreglo(matriz) aleatoriamente
	private void llenarArreglos(){
		System.out.println("Llenar arreglo A con palabras.");
		for(int i=0; i<arregloA.length; i++){
			System.out.print("Ingrese una palabra: ");
			arregloA[i] = entrada.nextLine();
		}
		
		System.out.println("\nLlenar arreglo B con palabras.");
		for(int i=0; i<arregloB.length; i++){
			System.out.print("Ingrese una palabra: ");
			arregloB[i] = entrada.nextLine();
		}
	}
	
	private void compararArreglos(){
		char[] palabraA = arregloA[0].toCharArray();
		char[] palabraB = arregloB[0].toCharArray();		
		if(arregloA[0].equals(arregloB[0])){
			System.out.println("\nPalabra en arreglo A es: "+ arregloA[0]+", indice 0. tamaño de la letra es: " +palabraA.length);
			System.out.println("Palabra en arreglo B es: "+ arregloB[0]+", indice 0. tamaño de la letra es: " +palabraB.length); 
			System.out.println("Las palabras son iguales en la posicion 0 de los arreglos.");
		} else {
			System.out.println("\nPalabra en arreglo A es: "+ arregloA[0]+", indice 0. tamaño de la letra es: " +palabraA.length);
			System.out.println("Palabra en arreglo B es: "+ arregloB[0]+", indice 0. tamaño de la letra es: " +palabraB.length); 
			System.out.println("Las palabras no son iguales en la posicion 0 de los arreglos");
		}
	}
	
	//Metodo main
	public static void main(String[] args){
		Ejercicio8 ejercicio8 = new Ejercicio8();
	}
	
	//Variables
	String[] arregloA = new String[5];
	String[] arregloB = new String[5];
	Scanner entrada = new Scanner(System.in);	
}
