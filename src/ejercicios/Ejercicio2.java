package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int principal[] = new int[20];
		
		int auxiliar[] = new int[20];
		
		int num;
		int puestopar = 0;
		int puestoimpar = auxiliar.length - 1;
		
		for (int i = 0; i < principal.length; i++) {
			principal[i] = (int) (Math.random() * 100 + 1);
			
			if (principal [i]%2 == 0) {
				auxiliar[puestopar]=principal[i];
				puestopar++;
			}else {
				auxiliar[puestoimpar]=principal[i];
				puestoimpar--;
			}
		}
		principal=auxiliar;
		System.out.println(Arrays.toString(principal));
	}

}
