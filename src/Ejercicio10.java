//Unidad6ProgramacionModular
package src;
import java.util.Scanner;

public class Ejercicio10{
	
	//Metodo constructor
	public Ejercicio10(){
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
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				System.out.print("["+i+"]["+j+"]. Digite un numero: ");
				matrizA[i][j] = entrada.nextInt();
			}
		}
			
	}
	
	//Mostrar la matriz
	private void mostrarMatriz(){
		System.out.println("\nMatriz A.");
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	
	//Trasponer la matriz y mostrar
	private void sumarMatrices(){
		System.out.println("\nMatriz traspuesta de matrizA");
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				matrizT[i][j] = matrizA[j][i];
				System.out.print(matrizT[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//Metodo main
	public static void main(String[] args){
		Ejercicio10 ejercicio10 = new Ejercicio10();
	}
	
	//Variables
	int[][] matrizA = new int[4][3];
	int[][] matrizT = new int[3][4];
	Scanner entrada = new Scanner(System.in);
}
