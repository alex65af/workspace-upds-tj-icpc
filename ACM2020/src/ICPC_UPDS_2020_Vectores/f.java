package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		// Palindromo Numerico
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean bandera = true;
		int[] vector = new int[n];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextInt();
		}
		if (vector[0] != 0 && vector[n - 1] != 0) {
			for (int i = 0; i < n / 2; i++) {
				if (vector[i] != vector[n - 1 - i]) {
					bandera = false;
					break;
				}
			}
			if (bandera) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}
	}

}
