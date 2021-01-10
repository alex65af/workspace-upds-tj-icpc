package Regional2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class m {

	public static void main(String[] args) throws RuntimeException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));

		// Scanner sc = new Scanner(System.in);
		String cad = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int porsiones = 0;
		char[] letras = cad.toCharArray();
		if (cad.contains("E")) {
			for (int i = 0; i <= letras.length - n; i++) {
				int cont = 1;
				if (letras[i] == 'E') {
					porsiones += n;
					continue;
				}
				while (cont < n) {
					if (letras[i + cont] == 'E')
						porsiones += n - cont;
					cont++;
				}
			}

			for (int i = 0; i < n - 1; i++) {
				int f = letras.length - n + 1;
				if (n == 1)
					break;
				int cont = 1;
				int ini = 0;
				if (letras[f] == 'E') {
					porsiones += n;
					f++;
					continue;
				}
				while (cont < n) {
					if (letras.length > f + cont) {
						if (letras[f + cont] == 'E')
							porsiones += n - cont;
						cont++;
					} else {
						if (letras[ini] == 'E')
							porsiones += n - cont;
						cont++;
					}
				}
				f++;
			}
		}
		System.out.println(porsiones);

	}

}
