package ejercicios;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numEnteros []= new int [100];
		int numEnteros2[]= new int [100];
		int num=100;
		for (int i=0;i<numEnteros.length;i++) {
			numEnteros[i]=i+1;
		}
		
		for(int i = 0; i<numEnteros2.length; i++ ) {
			numEnteros2[i]=num;
			num--;
		}
		
	System.out.println(Arrays.toString(numEnteros));
	System.out.println(Arrays.toString(numEnteros2));
	}

}
