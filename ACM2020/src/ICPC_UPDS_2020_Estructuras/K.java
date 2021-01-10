package ICPC_UPDS_2020_Estructuras;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		// Sumatoria
		Scanner sc = new Scanner(System.in);
		int a, p = 0, ne = 0, t = 0, n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (a > 0) {
				p++;
				t += a;
			} else {
				ne++;
				t += a;
			}
		}
		System.out.println(t + " " + p + " " + ne);

	}

}
