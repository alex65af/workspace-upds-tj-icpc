package Clases;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LibreriaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Math.E);
//		System.out.println(Math.PI);
////		
//		int x = -55;
//		System.out.println(Math.abs(x));
//		
//		System.out.println(Math.cos(0));
//		System.out.println(Math.sin(1));
//		System.out.println(Math.tan(0));
//		
//		//Logaritmo en base (e)
//		System.out.println(Math.log(10));
//		
//		//Logaritmo en base(10)
//		System.out.println(Math.log10(10));
//		
//		long a = 9223372036854775807L;
//		long b = 9147483000654632L;
//		
//		//System.out.println(a + b);
//		System.out.println(Math.addExact(a, b));
//		System.out.println(Math.multiplyExact(523, 213));
////		
//		System.out.println(Math.subtractExact(654654, 654));
//		
//		int var = -2147483647;
//		//var--;
//		//System.out.println(var);
//		System.out.println(Math.decrementExact(var));
//		
//		System.out.println(Math.incrementExact(var));
//		
//		int car = 0;
//		long l = 321654654L;
//		car = (int)l;
//		
//		car = Math.toIntExact(l);
//		
//		System.out.println(car);
//		//Raiz cuadrada
//		System.out.println(Math.sqrt(4));
//		//Raiz cubica
//		System.out.println(Math.cbrt(27));
//		
//		//Exponente de e 
//		//e^2
//		System.out.println(Math.exp(2));		
//		
//		
//		System.out.println(Math.floor(545.9654654215));
		
//		//Hipotenisa RaizCuadrada de la sumada de los catetos al cuadrado sqrt(x^2 + y^2)
//		System.out.println(Math.hypot(5, 6));
//		
	//	System.out.println(Math.max(15, 10));
//		
		//System.out.println(Math.min(20.30, 20.31));
//	
//		System.out.println(Math.pow(2, 4));
//		
//		//Genera numero mayores o igual a 0.0 y menores a 1.0
//		System.out.println(Math.random());
//		
//		System.out.println(Math.rint(564654.9));
////		
//		System.out.println(Math.round(6546.2));
////		
		
//		
		
		Scanner sc = new Scanner(System.in);
		BigInteger num = new BigInteger("18");
		BigInteger num1 = new BigInteger("21");
//		BigInteger num = BigInteger.ZERO;
//		num = BigInteger.ONE;
//		num = BigInteger.TEN;
		
//		System.out.println(num);
//		float f = num.floatValue();
//		System.out.println(f);
//		double d = num.doubleValue();
//		System.out.println(d);
//		int i = num.intValue();
//		System.out.println(i);
//		long l = num.longValue();
//		System.out.println(l);
		
		//maximo comun divisor
//	System.out.println(num.gcd(num1));
//				
//		BigInteger num = new BigInteger("1987989598651");
//		System.out.println(num.hashCode());
		BigInteger a  = sc.nextBigInteger(); //BigDecimal
		//BigInteger b = sc.nextBigInteger();
////				//Suma de BigInteger
//				System.out.println(a.add(b));
////				//Resta BigInteger
//				System.out.println(a.subtract(b));
////				//Multiplicacion BigInteger
//				System.out.println(a.multiply(b));
////				//Divicion BigInteger
//				System.out.println(a.divide(b));
////				//Valor Absoluto (Equivalente a Math.abs(a))
//				System.out.println(a.abs());
////				//Modulo (Equivalente a a%b)
//			    System.out.println(a.mod(b));
////				//Potencia (El exponente solo recibe valores enteros)
//				System.out.println(a.pow(2));
////				//Combinacion entre Modulo y Potencia
//				System.out.println(a.modPow(BigInteger.valueOf(2), b));
////				
//				System.out.println(a.max(b));
//				System.out.println(a.min(b));
//				System.out.println(a.toString());
				//Comparaciones
//				if(a.compareTo(b)==0){
//					/*	a = b 	0
//					 * 	a > b 	1
//					 *  a < b 	-1 
//					 */
//					System.out.println("Son Iguales");
//				}
//				else if(a.compareTo(b)==1)
//					System.out.println("A es mayor que B");
//				else
//					System.out.println("B es mayor que A");
				//Identifica si es primo 
//				if(a.isProbablePrime(100))
//					System.out.println("Es Primo");
//				else
//					System.out.println("No es Primo");
				//Devolver el primo siguiente
		//		System.out.println(a.nextProbablePrime());
//				//Maximo Comun Divisor
//				System.out.println(a.gcd(b));
				
//				

	}
}