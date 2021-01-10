package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class s {

	public static void main(String[] args) {
		// Suma de vectores
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] vec1 = new int[n];
		int[] vec2 = new int[n];
		for (int i = 0; i < vec1.length; i++) {
			vec1[i]=sc.nextInt();
		}
		for (int i = 0; i < vec2.length; i++) {
			vec2[i]=sc.nextInt()+vec1[i];
			System.out.print(vec2[i]+" ");
		}
	}

}
