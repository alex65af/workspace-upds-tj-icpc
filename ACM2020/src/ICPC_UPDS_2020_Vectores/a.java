package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// Ciclo mientras no cero
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int total = 0;
		do {
			n = sc.nextInt();
			total+=n;
		} while(n!=0);
		System.out.println(total);
}

}
