package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		//  Colección de Letras
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String cadena = sc.next();
		if (cadena.contains("d")) {
			int c = 0;
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i) == 'd')
					c++;
			}
			if (c >= n) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		} else {
			if (n >= 0) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}

}
