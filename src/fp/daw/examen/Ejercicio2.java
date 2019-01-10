package fp.daw.examen;

import java.util.Random;

public class Ejercicio2 {

	/*
	 * 2,5 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'vectorSuma' que reciba
	 * un array bidimensional de números reales y retorne un vector de números
	 * reales que contenga en cada posición i el resultado se sumar todos los
	 * números almacenados en la fila i del array bidimensional.
	 * 
	 */

	public static int[][] vectorSuma(int[][] array) {
		int[] vector = new int[array.length];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = array[i][i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + i);
		}

		return array;
	}

	/*
	 * 2,5 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el
	 * método 'vectorSuma'. Habrá que crear un array dimensión n * m, donde n y m
	 * serán números enteros aleatorios comprendidos entre 10 y 20, invocar al
	 * método 'vectorSuma' pasándole este array y finalizar mostrando por pantalla
	 * el array bidimensional y el vector retornado con un formato que facilite su
	 * legibilidad.
	 * 
	 */

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(20 - 10 + 1) + 10;
		int m = r.nextInt(20 - 10 + 1) + 10;
		
		int[][] suma = new int[n][m];
		vectorSuma(suma);
		
		System.out.println(vectorSuma(suma));
	}

}
