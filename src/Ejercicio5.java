//Unidad6ProgramacionModular
package src;

public class Ejercicio5{
	
	public Ejercicio5(){
		iniciarComponentes();
	}
	
	private void iniciarComponentes(){
		incisoA();
		incisoB();
		incisoC();
	}
	
	//Llenamos el arreglo-uni de forma aleatoria de numeros comprendidas entre 0-100
	private void incisoA(){
		int[] notasAlumnos = {5, 7, 2, 3, 9, 5, 6, 7, -50};
		int sumaNotas = 0;
		double promedio;
		for(int i=0; i<notasAlumnos.length; i++){
			if(notasAlumnos[i] != -50){
				sumaNotas = sumaNotas + notasAlumnos[i];
			}
		}
		
		promedio = sumaNotas/(notasAlumnos.length-1.00);
		System.out.println("El promedio de las notas en el inciso A es: " + promedio);
	}
	
	private void incisoB(){
		int[] notasAlumnos = {6, -50};
		int sumaNotas = 0;
		double promedio;
		for(int i=0; i<notasAlumnos.length; i++){
			if(notasAlumnos[i] != -50){
				sumaNotas = sumaNotas + notasAlumnos[i];
			}
		}
		
		promedio = sumaNotas/(notasAlumnos.length-1.00);
		System.out.println("El promedio de las notas en el inciso B es: " + promedio);
	}
	
	private void incisoC(){
		int[] notasAlumnos = {1, 5, 4, 7, 6, 2, 7, 8, 3, 2, 9, 4, 5, 3, 6, 6, 8, 8, - 50};
		int sumaNotas = 0;
		double promedio;
		for(int i=0; i<notasAlumnos.length; i++){
			if(notasAlumnos[i] != -50){
				sumaNotas = sumaNotas + notasAlumnos[i];
			}
		}
		
		promedio = sumaNotas/(notasAlumnos.length-1.00);
		System.out.println("El promedio de las notas en el inciso C es: " + promedio);
	}
	
	public static void main(String[] args){
		Ejercicio5 ejercicio5 = new Ejercicio5();
	}
}
