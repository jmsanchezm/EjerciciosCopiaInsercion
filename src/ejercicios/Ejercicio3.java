package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	static boolean esPrimo (int numero) {
		boolean primo=true;
		if (numero ==1) {
			primo=false;
		}
		for (int j = 2; j<numero;j++) {
			if (numero%j==0) {
				primo=false;
			}
		}
		return (primo);	
	}
	public static void main(String[] args) {
		int numeros []= new int [10];
		int numPrimos []= new int [10];
		int posPrimo=0;
		int posNormal= numeros.length-1;
		Scanner read= new Scanner (System.in);
		
		System.out.println("Introduzca 10 números: ");
		for(int i = 0; i < numeros.length; i++ ) {
			numeros[i]= read.nextInt();
			
	
			if(esPrimo (numeros[i])) {
				numPrimos[posPrimo]=numeros[i];
				posPrimo++;
			}else {
				numPrimos[posNormal]=numeros[i];
				posNormal--;
			}
		}
		numeros=numPrimos;
		System.out.println(Arrays.toString(numeros));
	}

}
