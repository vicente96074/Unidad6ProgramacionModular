//Unidad6ProgramacionModular
package src;
import java.util.Scanner;

public class Ejercicio1{
	
	public Ejercicio1(){
		iniciarComponentes();
	}
	
	private void iniciarComponentes(){
		//Para pedir datos al usuario
		for(int i=0; i<arregloNumeros.length; i++){
			arregloNumeros[i] = pedirElementos(i);
		}
		mostrarDatos();
	}
	
	private int pedirElementos(int indice){
		System.out.print(indice + ". Ingrese un numero: ");
		int numero;
		return numero = entrada.nextInt();
	}
	
	//Mostrar los datos del arreglo
	private void mostrarDatos(){
		for(int i=0; i<arregloNumeros.length; i++){
			System.out.println(i+ ". Dato ingresado: " + arregloNumeros[i]);
		}
	}
	
	public static void main(String[] args){
		Ejercicio1 ejercicio1 = new Ejercicio1();
	}
	
	int[] arregloNumeros = new int[5];
	Scanner entrada = new Scanner(System.in);
}
