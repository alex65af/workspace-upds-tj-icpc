package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		// Sumatoria
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = 0;
		int total = 0, pos = 0, neg = 0;
		while (n-- > 0) {
			val = sc.nextInt();
			total += val;
			if (val > 0) {
				pos++;
			} else {
				neg++;
			}
		}
		System.out.println(total + " " + pos + " " + neg);
	}

}
