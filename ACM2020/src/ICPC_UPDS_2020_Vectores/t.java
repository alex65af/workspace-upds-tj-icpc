package ICPC_UPDS_2020_Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class t {

	static boolean Creciente(int[] Vector, int[] VectorOrdenado) {
		boolean bandera = true;
		for (int i = 0; i < VectorOrdenado.length; i++) {
			if (Vector[i] != VectorOrdenado[i]) {
				bandera = false;
				break;
			}
		}
		return bandera;
	}

	static boolean Decreciente(int[] Vector, int[] VectorOrdenado) {
		boolean bandera = true;
		for (int i = 0; i < VectorOrdenado.length; i++) {
			if (Vector[i] != VectorOrdenado[VectorOrdenado.length - (1 + i)]) {
				bandera = false;
				break;
			}
		}
		return bandera;
	}

	public static void main(String[] args) {
		// pb Ordenando
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Vector = new int[n];
		int[] VectorOrdenado = new int[n];
		for (int i = 0; i < Vector.length; i++) {
			Vector[i] = sc.nextInt();
			VectorOrdenado[i] = Vector[i];
		}
		Arrays.sort(VectorOrdenado);
		if (Creciente(Vector, VectorOrdenado)) {
			System.out.println("CRECIENTE");
		} else if (Decreciente(Vector, VectorOrdenado)) {
			System.out.println("DECRECIENTE");
		} else {
			System.out.println("NO ORDENADA");
		}
	}

}
