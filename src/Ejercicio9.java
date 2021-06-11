//Unidad6ProgramacionModular
package src;
import java.util.Scanner;

public class Ejercicio9{
	
	//Metodo constructor
	public Ejercicio9(){
		iniciarComponentes();
	}
	
	//Para inicar los demas metodos de la clase
	private void iniciarComponentes(){
		llenarMatriz();
		mostrarMatriz();
		sumarMatrices();
	}
	
	//Llenar arreglo(matriz) desde teclado
	private void llenarMatriz(){
		System.out.println("\nLlenar matriz A desde teclado.");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print("["+i+"]["+j+"]. Digite un numero: ");
				matrizA[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("\nLlenar matriz B desde teclado.");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print("["+i+"]["+j+"]. Digite un numero: ");
				matrizB[i][j] = entrada.nextInt();
			}
		}
			
	}
	
	//Mostrar los matrices llenados
	private void mostrarMatriz(){
		System.out.println("\nMatriz A.");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("\nMatriz B.");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	
	//Sumar a los dos matrices
	private void sumarMatrices(){
		System.out.println("\nMatrizC =  MatrizA + MatrizB");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
			matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//Metodo main
	public static void main(String[] args){
		Ejercicio9 ejercicio9 = new Ejercicio9();
	}
	
	//Variables
	int[][] matrizA = new int[2][2];
	int[][] matrizB = new int[2][2];	
	int[][] matrizC = new int[2][2];
	Scanner entrada = new Scanner(System.in);
}
