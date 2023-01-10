package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numeros [] = new int [15];
		int numAvanzado[]= new int[15];
		Scanner read = new Scanner (System.in);
		
		System.out.println("Introduzca 15 números:");
		
		for (int i=0; i<numeros.length; i++) {
		numeros [i]= read.nextInt();
		}
		
		numAvanzado [0]= numeros[14];
		
		System.arraycopy(numeros, 1, numAvanzado, 1,numAvanzado.length-2);
		
		read.close();
		System.out.println(Arrays.toString(numAvanzado));
	}

}
