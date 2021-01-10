package Clase1;

public class Invertir {

	public static int reverse(int x) {
		int i = 10, y = 0, sum = 0;
		do {
			y = x % 10;
			x = x / 10;
			sum = sum * i + y;
		} while (x != 0);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 111023;
		System.out.println(reverse(n));
		
		double d = 44244.2426124;
		double consumo = 1234.14377777;
		System.out.println(Math.rint(d*1000)/1000); //redondeo a 3 decimales
		System.out.printf("%.4f\n",consumo);
		
		System.out.println("Redondeo ceil");
		System.out.println(Math.ceil(2.8)); //Redondeo para arriba
		System.out.println(Math.ceil(2.2)); //Redondeo para arriba
		
		System.out.println("Redondeo floor");
		System.out.println(Math.floor(2.2)); //Redondeo para abajo
		System.out.println(Math.floor(2.8));
		
		System.out.println("Redondeo round");
		System.out.println(Math.round(2.2)); //Redondeo normal
		System.out.println(Math.round(2.8));
	}

}
