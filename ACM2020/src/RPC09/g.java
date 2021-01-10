package RPC09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class g {
//	public static int _sieve_size;
	public static boolean[] factores; // 10^7 debería ser suficiente para la mayoría de los casos
//	public static List<Integer> primes = new ArrayList<Integer>(); // lista compacta de primos en forma de lista <int>

	public static void relleno(int n) {
		factores = new boolean[n+1];
		Arrays.fill(factores, false);
		factores[1]=true;
		
	}
//	// first part
//	public static void sieve(int upperbound) { // create list of primes in [0..upperbound]
//		_sieve_size = upperbound + 1; // add 1 to include upperbound
//		bs = new boolean[_sieve_size];
//		Arrays.fill(bs, true); // establecer todos los bits en true
//		bs[0] = bs[1] = false; // excepto índice 0 y 1
//		for (long i = 2; i < _sieve_size; i++)
//			if (bs[(int) i]) {
//				// cross out multiples of i starting from i * i!
//				for (long j = i * i; j < _sieve_size; j += i)
//					bs[(int) j] = false;
//				primes.add((int) i); // also add this vector containing list of primes
//			}
//	} // call this method in main method
//	
//	public static long numDiv(long N) {
//		int PF_idx = 0;
//		long PF = primes.get(PF_idx), ans = 1; // start from ans = 1
//		while (N != 1 && (PF * PF <= N)) {
//			long power = 0; // count the power
//			while (N % PF == 0) {
//				N /= PF;
//				power++;
//				System.out.println(PF);
//			}
//			ans *= (power + 1); // according to the formula
//			PF = primes.get(++PF_idx);
//		}
//		if (N != 1)
//			ans *= 2; // (last factor has pow = 1, we add 1 to it)
//		return ans;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sieve(10000000); // sieve(10000000); // can go up to 10^7 (need few seconds)
//		System.out.printf("numDiv(%d) = %d\n", 50, numDiv(50)); // 1, 2, 5, 10, 25, 50, 6 divisors
		int n = 30;
		int z = 1;
		
	}

}
