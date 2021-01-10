package ICPC_UPDS_2020_Estructuras;

import java.util.ArrayList;
import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		// Consecutivos
		Scanner sc = new Scanner(System.in);
		int i, n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> x = new ArrayList<Integer>();
		boolean bandera = true;
		String r = sc.nextLine();
		String m[] = r.split(" ");
		if (n > 0)
			x.add(Integer.parseInt(m[0]));
		int aux = (int) x.get(0);
		for (i = 1; i < n; i++) {
			x.add(Integer.parseInt(m[i]));
			aux = Math.min(aux, (int) x.get(i));
		}

		for (i = 0; i < n; i++) {
			if (!x.contains(aux++)) {
				bandera = false;
				break;
			}
		}
		if (bandera)
			System.out.println("SI");
		else
			System.out.println("NO");

	}

}
