package Clase2;

import java.util.Scanner;

public class Cuadro_magico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int uno = 0;
		while (sc.hasNext()) {
			if (uno == 1)
				System.out.println();
			uno = 1;
			int n = sc.nextInt();
			System.out.printf("n = %d, sum = %d\n", n, n * (n * n + 1) / 2);
			int matriz[][] = new int[15][15], x = 0, y = n / 2;
			for (int i = 1; i <= n * n; i++) {
				if (matriz[x][y] != 0) {
					x += 2;
					y--;
					if (x >= n)
						x -= n;
					if (y < 0)
						y += n;
					matriz[x][y] = i;
				} else
					matriz[x][y] = i;
				x--;
				y++;
				if (x < 0)
					x += n;
				if (y >= n)
					y -= n;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					System.out.printf(" " + matriz[i][j]);
				System.out.println();
			}
		}

	}

}
