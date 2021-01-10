package Clase1;

public class Numeros_Consecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Suma de los numeros consecutivos entre dos numeros
		int nf = 10, ni = 3;
		System.out.println(((nf-ni+1)*(nf+ni)/2));
		
		//Sumar los n múltiplos de un número
		int p = 4;
		System.out.println(((nf-ni+1)*(nf+ni)*p/2));
		
		//Sumar múltiplos consecutivos de un número
		//		a: Es el primer valor de la sucesión.
		//		b: Es el último valor de la sucesión.
		//		n: Es el número de elementos consecutivos que buscamos.
		//		p: El numero del cual buscamos sus multiplos
		// 		b = a + p·(n-1)
		int a=49,b,n=4;
		p = 7;
		b=a+p*(n-1);
		System.out.println((a+b)*n/2);
		
	}

}
