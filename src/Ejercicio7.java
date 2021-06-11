//Unidad6ProgramacionModular
package src;

public class Ejercicio7{
	
	//Metodo constructor
	public Ejercicio7(){
		iniciarComponentes();
	}
	
	//Para inicar los demas metodos de la clase
	private void iniciarComponentes(){
		llenarArreglo();
		sumaFilasPar();
	}
	
	//Llenar arreglo(matriz) aleatoriamente
	private void llenarArreglo(){
		System.out.println("Arreglo llenado aleatoriamente.");
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				matrizNumeros[i][j] = (int) (Math.random() *555);
				System.out.print(matrizNumeros[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}
	
	//Funcion para sumar las filas par
	private void sumaFilasPar(){
		System.out.println("\nSumando las filas par.");
		for(int i=0; i<4; i++){
			if(i%2==0){
				int suma = 0;
				for(int j=0; j<3; j++){
					suma = suma + matrizNumeros[i][j];
				}
				System.out.println("\nSuma de la fila "+i+ " es: "+suma);
			}
		}
	}
	
	//Metodo main
	public static void main(String[] args){
		Ejercicio7 ejercicio7 = new Ejercicio7();
	}
	
	//Variables
	int[][] matrizNumeros = new int[4][3];
}
