package Clase1;

import java.math.BigInteger;
import java.util.Scanner;

public class Numeros_Catalanes {

	public static BigInteger[] vector = new BigInteger[6000];
	public static void coeficienteBinomial() {
		
		vector[0] = BigInteger.ONE;
		vector[1]=BigInteger.ONE;
		
		for(int i = 2;i<=5100; i++) { //Generado jasta 5100
			BigInteger numerador =BigInteger.valueOf(2*i*(2*i-1));
			BigInteger denominador=BigInteger.valueOf(i*(i+1));
			vector[i]=vector[i-1].multiply(numerador).divide(denominador);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coeficienteBinomial();
		System.out.println(vector[n]);
	}
}
