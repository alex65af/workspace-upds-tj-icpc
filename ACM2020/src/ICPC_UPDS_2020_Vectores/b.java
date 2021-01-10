package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// Encuentra el mayor
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int aux = 0;
		int[] vector = new int[n];

		for (int i = 0; i < n; i++) {
			vector[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (vector[j] > vector[j + 1]) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}

		}
		System.out.println(vector[n - 1]);
	}

}
