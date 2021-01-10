package ICPC_UPDS_2020_Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class p {

	public static void main(String[] args) {
		// Mínimos y Máximos
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max,min,contador=0;
		int[] vector = new int [n];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=sc.nextInt();
		}
		Arrays.sort(vector);
		n--;
		max=vector[vector.length-1];
		min=vector[0];
		while(n>=0 && max==vector[n]) {
			contador++;
			n--;
		}
		System.out.printf(min+" "+contador);
		
	}
}
