package ICPC_UPDS_2020_Estructuras;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		// Selectivas-Aprobado o Reprobado
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		if (nota > 5)
			System.out.println("APROBATORIA");
		else
			System.out.println("REPROBATORIA");
	}

}
