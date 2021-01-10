package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class q {

	public static void main(String[] args) {
		// Secuencia creciente
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int creciente = sc.nextInt();
		int max = 0;
		do {
			contador++;
			max = creciente;
			creciente = sc.nextInt();
		} while(max<creciente);
		System.out.println(contador);
	}

}
