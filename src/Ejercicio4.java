//Unidad6ProgramacionModular
package src;
import java.util.Scanner;

public class Ejercicio4{
	
	public Ejercicio4(){
		iniciarComponentes();
	}
	
	private void iniciarComponentes(){
		llenarArregloAleatoriamente();
		datoMayor();
	
	}
	
	//Llenamos el arreglo-uni de forma aleatoria de numeros comprendidas entre 0-100
	private void llenarArregloAleatoriamente(){
		for(int i=0; i<arregloNumeros.length; i++){
			arregloNumeros[i] = (int) (Math.random() *100);
		}	
	}
	
	private void datoMayor(){
		int datoMayor = 0;
		
		//Encontrar un dato mayor
		for(int i=0; i<arregloNumeros.length; i++){
			if(datoMayor<arregloNumeros[i]){
				datoMayor = arregloNumeros[i];
			}
		}
		
		System.out.println("Elemento mayor: "+datoMayor);
		
		//Distancia entre los más elementos y el dato mayor
		for(int i=0; i<arregloNumeros.length; i++){
			if(arregloNumeros[i] != datoMayor){
				int distancia;
				distancia = datoMayor - arregloNumeros[i];
				System.out.println("Indice: " +i+" La distancia que se encuentra el numero " + arregloNumeros[i] + " del dato mayor es: " + distancia); 
			}
		}
		
	}
	
	public static void main(String[] args){
		Ejercicio4 ejercicio4 = new Ejercicio4();
	}
	
	int[] arregloNumeros = new int[10];
	Scanner entrada = new Scanner(System.in);
}
