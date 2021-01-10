package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class o {

	public static void main(String[] args) {
		// La gema de la mente
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int gemas = 0;
		int[] dulces = new int[n];
		for (int i = 0; i < dulces.length; i++) {
			dulces[i] = sc.nextInt();
		}
		int alma = sc.nextInt();
		for (int i = 0; i < dulces.length; i++) {
			if (alma - 3 <= dulces[i] && alma + 3 >= dulces[i]) {
				System.out.print(dulces[i] + " ");
			}
		}
	}

}
