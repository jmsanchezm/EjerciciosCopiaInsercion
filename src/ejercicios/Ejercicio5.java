package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int tablaEntero []= new int [10];
		int numPares[]=new int[0] ;
		int numImpares[]=new int[0] ;
		int numPar=0;
		int numImpar=0;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Introduzca 10 números:");
		for (int i=0; i<tablaEntero.length;i++) {
			tablaEntero [i]= read.nextInt();
			
			if (tablaEntero [i]%2 == 0) {
				numPares=Arrays.copyOf(numPares, numPares.length+1);
				numPares[numPar]=tablaEntero[i];
				numPar++;
			
			}else {
				numImpares=Arrays.copyOf(numImpares, numImpares.length+1);
				numImpares[numImpar]=tablaEntero[i];
				numImpar++;
			
			}
		}
		System.out.println(Arrays.toString(numPares));
		System.out.println(Arrays.toString(numImpares));
		read.close();
	}

}
