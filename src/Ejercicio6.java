//Unidad6ProgramacionModular
package src;
import java.util.Scanner;

public class Ejercicio6{
	
	public Ejercicio6(){
		iniciarComponentes();
	}
	
	private void iniciarComponentes(){
		mostrarDatos();
		multiplicarPorUnaConstante();
	}
	
	
	//Mostrar los datos de la matriz
	private void mostrarDatos(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(matrizNumeros[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}
	
	private void multiplicarPorUnaConstante(){
		System.out.println("\nMatriz multiplicado * 2.");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				matrizNumeros[i][j] = matrizNumeros[i][j]*2;
				System.out.print(matrizNumeros[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		Ejercicio6 ejercicio6 = new Ejercicio6();
	}
	
	int[][] matrizNumeros = {{5,6, 13}, {14, 2, 4}, {21, 7, 6}};
	Scanner entrada = new Scanner(System.in);
}
