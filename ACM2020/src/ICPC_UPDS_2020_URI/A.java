package ICPC_UPDS_2020_URI;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// URI Online Judge | 2006 Identifying Tea
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int resultado = 0;
		for (int i = 0; i < 5; i++)
			if (t == sc.nextInt())
				resultado++;
		System.out.println(resultado);
	}
}
