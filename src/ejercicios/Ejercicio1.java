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
		
		numAvanzado=Arrays.copyOfRange(numeros, 0, numeros.length-1);
		numAvanzado[0]= numeros[numeros.length-1];
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(numAvanzado));
		
		read.close();
		
	}

}
