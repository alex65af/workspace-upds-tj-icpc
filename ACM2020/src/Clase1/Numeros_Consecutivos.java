package Clase1;

public class Numeros_Consecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Suma de los numeros consecutivos entre dos numeros
		int nf = 10, ni = 3;
		System.out.println(((nf-ni+1)*(nf+ni)/2));
		
		//Sumar los n m�ltiplos de un n�mero
		int p = 4;
		System.out.println(((nf-ni+1)*(nf+ni)*p/2));
		
		//Sumar m�ltiplos consecutivos de un n�mero
		//		a: Es el primer valor de la sucesi�n.
		//		b: Es el �ltimo valor de la sucesi�n.
		//		n: Es el n�mero de elementos consecutivos que buscamos.
		//		p: El numero del cual buscamos sus multiplos
		// 		b = a + p�(n-1)
		int a=49,b,n=4;
		p = 7;
		b=a+p*(n-1);
		System.out.println((a+b)*n/2);
		
	}

}
