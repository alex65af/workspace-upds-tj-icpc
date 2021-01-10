package ICPC_UPDS_2020_Estructuras;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// Gastos
		Scanner sc = new Scanner(System.in);
		int a, s = 0, t = 0;
		while (sc.hasNext()) {
			a = sc.nextInt();
			if (a == 0)
				break;
			s += a;
			t++;
		}
		System.out.println(s + " " + t);
	}
}
