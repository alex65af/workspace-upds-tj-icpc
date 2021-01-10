package Clases;

import java.util.Scanner;

public class Sca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);

		String s1 = "cuernojlkdsjfurjs";
		String s2 = "a";

		
	//	char[] cad = "Cuaerna casr cas ra".toCharArray();
//		System.out.println(cad[5]);
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareToIgnoreCase(s2));
		
//		System.out.println(s1.indexOf(114));
//		System.out.println(s1.indexOf("er"));
//		
//		System.out.println(s1.indexOf("j", s1.length()/2));
//		System.out.println(s1.lastIndexOf("Car", 10));
//		
	
//		System.out.println(s1.charAt(0));
//		System.out.println(s1.codePointAt(0));
//		System.out.println(s2.codePointBefore(1));
		
		
//		System.out.println(s1.contains("no"));
		
//		String cadena = s1.copyValueOf(cad);
//		String cadena1 = s1.copyValueOf(cad, 10,5);
//		System.out.println(cadena1);
		
//		System.out.println(cadena.intern());
		
//		Scanner sc = new Scanner(System.in);
//		String s= " ";
//		String ca = "Hola Mundo";
//		StringBuilder sb = new StringBuilder(ca);
//		System.out.println(sb);
//		System.out.println(sb.deleteCharAt(5));
//		System.out.println(sb.delete(1, 6));
//		System.out.println(sb.reverse());
//		//char [] array = "asdjlasdj askld ja;ls kdjals".toCharArray();
//		System.out.println(sb.insert(2, " Cadena ", 1, 6));
//		//System.out.println(sb.insert(2, array, 0, 1));
//		System.out.println(sb.replace(0, 4, "UPDS"));
		
//		//String ca2 = String.valueOf(sb);
//		String ca2 = sb.toString();
//		
//		
//		////Character
		int digitos = 0;
		int letras=0;
		int letrasM = 0;
		int letrasmin =0;
		int espacios=0;
		
		String cad = "1234abcABC##$$   ";
		
		for (int i = 0; i < cad.length(); i++) {
			if(Character.isDigit(cad.charAt(i)))
				{
				digitos++;
				}
			if(Character.isLetter(cad.charAt(i)))
			{
				letras++;
			}
			if(Character.isUpperCase(cad.charAt(i)))
			{
				letrasM++;
			}
			if(Character.isLowerCase(cad.charAt(i)))
			{
				letrasmin++;
			}
			if(Character.isSpaceChar(cad.charAt(i)))
			{
				espacios++;
			}
		}
//		
		System.out.println(digitos);
		System.out.println(letras);
		System.out.println(letrasM);
		System.out.println(letrasmin);
		System.out.println(espacios);
	
	}

}
