package ICPC_UPDS_2020_Vectores;

import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		// Hablando en P
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i =0; i<n; i++) {
			String palabra = sc.nextLine();
			palabra = palabra.replaceAll("a", "apa");
			palabra = palabra.replaceAll("e", "epe");
			palabra = palabra.replaceAll("i", "ipi");
			palabra = palabra.replaceAll("o", "opo");
			palabra = palabra.replaceAll("u", "upu");
			
			
//			for(int j=0; j<palabra.length(); j++) {
//				if(palabra.charAt(j)=='a' || palabra.charAt(j)=='e' ||palabra.charAt(j)=='i' ||palabra.charAt(j)=='o' ||palabra.charAt(j)=='u') 
//				{
//					System.out.print(palabra.charAt(j)+"p"+palabra.charAt(j));
//				}
//				else 
//				{
//					System.out.print(palabra.charAt(j));
//				}
//			}
			System.out.println(palabra);
		}
	}

}
