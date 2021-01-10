package ICPC_UPDS_2020_Estructuras;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// Ahorrando para los Yoyos
		Scanner sc = new Scanner(System.in);
		int i, x, b = 0;
		x = sc.nextInt();
		for (i = 0; i < 7; i++) {
			if (x < sc.nextInt())
				b++;
		}
		System.out.println(b);
	}
}
