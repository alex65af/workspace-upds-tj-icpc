package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		// Orden Creciente
		
		Scanner sc = new Scanner(System.in);
		boolean bandera = true;
		int n = sc.nextInt();
		int[] vec = new int [n];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=sc.nextInt();
		}
		
		for (int i = 1; i < vec.length; i++) {
			if(vec[i]<vec[i-1]) {
				bandera = false;
				break;
			} 
		}
		System.out.println(bandera? "SI" : "NO");
	}	

}
