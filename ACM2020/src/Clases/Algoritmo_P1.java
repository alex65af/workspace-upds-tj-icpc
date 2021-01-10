package Clases;

import java.math.BigInteger;
import java.util.Scanner;

public class Algoritmo_P1 {

	static int Euclides(int a, int b){
		int r=b;
		while(r != 0)
		{
			r=a%b; // reciduo
			a=b;	//dividendo
			b=r;	//divisor
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Euclides
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Euclides(a,b));
//		
		
//		Fibonacci
//		Scanner sc = new Scanner(System.in);
//		BigInteger fib[] = new BigInteger[5001];
//		fib[0] =BigInteger.ZERO;
//		fib[1]=BigInteger.ONE;
//		for (int i = 2; i < fib.length; i++) {
//			fib[i]=fib[i-1].add(fib[i-2]);
//		}
//		while(sc.hasNext()){
//			int n = sc.nextInt();
//			System.out.println("The Fibonacci number for "+n+" is "+fib[n]);	
//		}
	}

}
