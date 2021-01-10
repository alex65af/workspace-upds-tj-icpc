package ICPC_UPDS_2020_Estructuras;

import java.util.Scanner;

public class H {

	public static void main(String[] args) {
		// Orden Creciente
		Scanner sc = new Scanner(System.in);
		int i, a = 0, n = sc.nextInt();
		boolean bandera = true;
		if (n > 0)
			a = sc.nextInt();
		for (i = 1; i < n; i++)
			if (a > sc.nextInt()) {
				bandera = false;
				break;
			}
		if (bandera)
			System.out.println("SI");
		else
			System.out.println("NO");
	}

}
