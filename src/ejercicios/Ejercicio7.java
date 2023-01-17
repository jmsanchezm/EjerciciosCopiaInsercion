package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int numEntero[]= new int[10];
		
		String eleccion;
		
		int valor;
		int posicion;
		
		Scanner read= new Scanner(System.in);
		System.out.println("Introduzca 10 números: ");
		for (int i =0; i<numEntero.length;i++) {
			numEntero [i]= read.nextInt();
			
		}
		do {
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("a. Mostrar valores");
		System.out.println("b. Introducir valores");
		System.out.println("c. Salir");
		
		eleccion=read.next();
		eleccion.toLowerCase();
		switch (eleccion) {
		
		case "a", "A":
			System.out.println(Arrays.toString(numEntero));
			break;
			
		case "b", "B":
			System.out.println("Introduzca un valor:");
			valor=read.nextInt();
			System.out.println("Introduzca la posición en la que desea añadirlo");
			posicion=read.nextInt();
			numEntero[posicion]=valor;
			
			break;
			
		case "c", "C":
			System.out.println("Has salido del programa.");
			break;
		}
		}while(eleccion.equals("a")&&eleccion.equals("b"));
		
		read.close();
	}

}
