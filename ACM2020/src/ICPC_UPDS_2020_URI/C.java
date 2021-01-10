package ICPC_UPDS_2020_URI;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// URI Online Judge | 2702 Hard Choice
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int c2 = sc.nextInt();
		int total = 0;
		if (a1 - a2 < 0)
			total += a1 - a2;
		if (b1 - b2 < 0)
			total += b1 - b2;
		if (c1 - c2 < 0)
			total += c1 - c2;
		System.out.println(Math.abs(total));
	}

}
