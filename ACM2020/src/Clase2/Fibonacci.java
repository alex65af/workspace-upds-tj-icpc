package Clase2;

public class Fibonacci {

	public static int fiboIterativo(int n) {
		if(n<=2) {
			if(n==0) return 1;
			else return n;
		}
		int res = 0;
		int act = 1;
		int ant = 0;
		int i = 0;
		while(i<n) {
			int temp;
			res = act + ant;
			temp = act;
			act = res;
			ant = temp;
			i++;
		}
		return res;
	}
	
	public static int FiboRecursivo (int n) {
		if(n<=2)
			return n;
		else
			return FiboRecursivo(n-1) + FiboRecursivo(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fiboIterativo(9));
		System.out.println(FiboRecursivo(9));
	}

}
