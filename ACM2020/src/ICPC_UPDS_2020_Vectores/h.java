package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		// 0.0 Ayudando a Mr. Trance
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		String [] frase = sc.nextLine().split(" ");
		int contador = 0;
		for (int i = 0; i < frase.length; i++) {
			if(palabra.equalsIgnoreCase(frase[i])) {
				contador++;
			}
		}
		System.out.println(contador);
	}

}
