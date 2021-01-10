package ICPC_UPDS_2020_Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class n {

	public static void main(String[] args) {
		// Consecutivos
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] vec = new int [n];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=sc.nextInt();
		}
		
//		int aux = 0;
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = 0; j < n - 1 - i; j++) {
//				if (vec[j] > vec[j + 1]) {
//					aux = vec[j];
//					vec[j] = vec[j + 1];
//					vec[j + 1] = aux;
//				}
//			}
//
//		}
		
		Arrays.sort(vec);
		
		int a = vec[0]+1;
		boolean bandera = true;
		for (int i = 1; i < vec.length; i++) {
			if(a++!=vec[i]) {
				bandera = false;
				break;
			}
		}
		
		System.out.println(bandera? "SI":"NO");
	}

}
