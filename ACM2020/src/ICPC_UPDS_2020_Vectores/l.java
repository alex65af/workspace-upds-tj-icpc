package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		// Mensaje de Amor
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int corazones = 0;
		while(n-->0) {
			corazones = sc.nextInt();
			for (int i = 0; i < corazones; i++) {
				System.out.print("<3");
			}
			System.out.println();
		}
	}

}
