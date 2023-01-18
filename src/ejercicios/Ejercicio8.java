package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int valores []= new int[0];
		
		int valorInicial;
		int incremento;
		int numValores;
		
		Scanner read= new Scanner (System.in);
		
		System.out.println("Introduzca el valor inicial del que debe partir:");
		valorInicial=read.nextInt();
		System.out.println("Introduzca el incremento que desea hacer:");
		incremento= read.nextInt();
		System.out.println("Introduzca el tamaño que desea tener el array: ");
		numValores= read.nextInt();
		
		valores=Arrays.copyOf(valores, valores.length+numValores);
		
		valores[0]=valorInicial;
		
		for (int i = 1; i<valores.length;i++) {
			valores[i]=valorInicial+incremento;
			incremento+=incremento;
		}
		System.out.println(Arrays.toString(valores));
		
		read.close();
	}

}
