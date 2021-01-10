package ICPC_UPDS_2020_URI;

import java.math.BigInteger;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// URI Online Judge | 2699 Enigma
		Scanner sc = new Scanner(System.in);
		
		String[] cadena = sc.nextLine().split(" ");
		String resultado = cadena[0];
		boolean[] posicion = new boolean[cadena[0].length()];
		boolean bandera = true;
		if (cadena[0].charAt(cadena[0].length() - 1) != '?' && cadena[0].charAt(cadena[0].length() - 1) % 2 != 0
				&& Integer.parseInt(cadena[1]) % 2 == 0)
			System.out.println("*");
		else {
			for (int i = 0; i < cadena[0].length(); i++) {
				if (cadena[0].charAt(i) != '?')
					posicion[i] = true;
			}
			if (resultado.charAt(0) == '?')
				resultado = "1" + resultado.substring(1);
			resultado = resultado.replace('?', '0');
			BigInteger b = new BigInteger(resultado);
			//System.out.println(b);
			
			if (new BigInteger(resultado).mod(new BigInteger(cadena[1]))==BigInteger.ZERO)
				System.out.println(resultado);
			else {
				//System.out.println(b.divide(new BigInteger(cadena[1])));
				BigInteger a = b.divide(new BigInteger(cadena[1])).add(BigInteger.ONE);
				resultado = String.valueOf(a.multiply(new BigInteger(cadena[1])));
				//System.out.println(resultado);
				while (resultado.length() == cadena[0].length()) {
					bandera = true;
					for (int i = 0; i < posicion.length; i++) {
						if (posicion[i]) {
							if (resultado.charAt(i) != cadena[0].charAt(i)) {
								bandera = false;
								break;
							}
						}
					}
					if (bandera) {
						System.out.println(resultado);
						break;
					} else {
						a=a.add(BigInteger.ONE);
						resultado = String.valueOf(a.multiply(new BigInteger(cadena[1])));
						//System.out.println(resultado);
					}
				}
				if (resultado.length() != cadena[0].length())
					System.out.println("*");
			}
		}
	}
}
