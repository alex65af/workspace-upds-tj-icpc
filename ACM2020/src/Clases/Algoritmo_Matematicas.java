package Clases;

import java.math.BigInteger;
import java.util.Arrays;

public class Algoritmo_Matematicas {

	public static boolean[] criba(int n) {
		boolean[] primos = new boolean[n + 1];
		Arrays.fill(primos, true);
		primos[0] = primos[1] = false;
		for (int i = 2; i < (int) Math.sqrt(n) + 1; i++)
			if (primos[i])
				for (int j = i * i; j < primos.length; j+=i)
					primos[j] = false;
		return primos;

	}

	
	public static void main(String[] args) {
		// Torre de Hanoi
		// Cantidad de movimientos minimos
		// Dos elevado a la cantidad de fichas menos uno == (2^f) - 1
		int fichas = 4;
		int movimientos = (int) Math.pow(2, fichas) - 1;
		System.out.println(movimientos);

		// Criba de Erastotenes
		// Identificar numeros primos
//		int contador = 0;
		int i, j;
//		for (i = 1; i < 11; i++) {
//			for (j = 1; j < 11; j++) {
//				System.out.print(++contador + "\t");
//			}
//			System.out.println();
//		}
		boolean primos[] = criba(100);
		System.out.println(primos[99]?"Es primo":"No es primo");
		
		//Funcion Primos - BigInteger
		BigInteger b = new BigInteger("1009");
		System.out.println(b.isProbablePrime(100));
		
		//Triangulo de Pascal
		int[] a = new int[1];
		for(i = 0; i<17; i++) {
			int x[] = new int[i];
			for(j=0;j<i;j++) {
				if(j==0 || j==(i-1))
					x[j]=1;
				else
					x[j]=a[j]+a[j-1];
				System.out.print(x[j]+" ");
			}
			a = x;
			System.out.println();
		}
		
		//Numeros Triangulares
		int n = 4;
		int resultado = (n*(n+1))/2;
		System.out.println(resultado);
		
		//Area del copo de nieve de Koch
		int s = 5;
		double area = (2 * Math.sqrt(3)*(s*s))/5;
		System.out.printf("%.2f",area);
	}

}
