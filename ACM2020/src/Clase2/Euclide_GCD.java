package Clase2;

import java.math.BigInteger;
import java.util.Scanner;

public class Euclide_GCD {

//	public static int Euclides(int a, int b) {
//		int r =b;
//		while (b>0) {
//			r=a%b;
//			a=b;
//			b=r;
//		}
//		return a;
//	}
	
	//Maximo comun divisor
	public static long gcd(long a, long b) {
		return b==0? Math.abs(a):gcd(b, a%b);
	}
	
	//minimo comun multiplo
	public static long lcm(long a, long b) {
		return Math.abs(a / gcd(a,b) *b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		a = a.gcd(b);
		System.out.println(a);
	
		System.out.println(lcm(20,12));
	}

}
