//Unidad6ProgramacionModular
package src;
import java.util.Scanner;

public class Ejercicio2{
	
	public Ejercicio2(){
		iniciarComponentes();
	}
	
	private void iniciarComponentes(){
		//Generamos un arreglo llenado con datos aleatorios
		for(int i=0; i<arregloNumeros.length; i++){
			arregloNumeros[i] = generarUnNumeroAleatorio();
		}
		mostrarDatos();
		datoMayor();
	}
	
	//Numero aleatorio 0-100
	private int generarUnNumeroAleatorio(){
		int numero;
		return numero = (int) (Math.random() *99);
	}
	
	//Mostrar los datos del arreglo
	private void mostrarDatos(){
		for(int i=0; i<arregloNumeros.length; i++){
			System.out.println(i+ ". Dato generado aleatoriamente: " + arregloNumeros[i]);
		}
	}
	
	private void datoMayor(){
		int datoMayor = 0;
		int vecesSeRepite = 0;
		
		//Encontrar un dato mayor
		for(int i=0; i<arregloNumeros.length; i++){
			if(datoMayor<arregloNumeros[i]){
				datoMayor = arregloNumeros[i];
			}
		}
		
		//Encontrar las veces que se repite
		for(int i=0; i<arregloNumeros.length; i++){
			if(datoMayor == arregloNumeros[i]){
				vecesSeRepite++; 
			}
		}
		System.out.println("Elemento mayor: "+datoMayor);
		System.out.println("Veces que se repite el elemento mayor: "+vecesSeRepite);
	}
	
	public static void main(String[] args){
		Ejercicio2 ejercicio2 = new Ejercicio2();
	}
	
	int[] arregloNumeros = new int[99];
	Scanner entrada = new Scanner(System.in);
}
