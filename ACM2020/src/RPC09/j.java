package RPC09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  j{


//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String[] nombres = new String[n];
//		for (int i = 0; i < n; i++) {
//			nombres[i] = sc.nextLine();
//		}
//		Arrays.sort(nombres);
//		int contador=0;
//		for(String var: nombres) {
//			for (int i = 1; i < n; i++) {
//				if(var == nombres[i])
//					continue;
//				if(comparar(var, nombres[i]))
//					contador++;
//				else
//					break;
//				System.out.println(var+" "+ nombres[i]);
//			}
//		}
//		System.out.println(contador);
//
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] ListaNombres = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
		
		Set<Integer> Posiciones = new HashSet<Integer>();
		
		int contador=0;
		while(n-->0) {
		String nombre = sc.next();
		
		int p = nombre.codePointAt(0)-65;
		Posiciones.add(p);
		ListaNombres[p]+=nombre+" ";
		}
		int i=0;
		for(int in: Posiciones) {
				i=0;
				
				String[] Lista = ListaNombres[in].trim().split(" ");
				if(Lista.length>1) {
					Arrays.sort(Lista);
					while(i<Lista.length) {
						int repetidor=0;
					System.out.println(i);
					System.out.println(Lista[i]);
					String regex = Lista[i];
					Pattern patron = Pattern.compile(regex);
					Matcher m = patron.matcher(ListaNombres[in]);
					while(m.find())
						repetidor++;
					contador += (Lista.length - repetidor)*(repetidor);
					i+=repetidor;
					System.out.println(contador);
					}
					System.out.println(ListaNombres[in]);
				}
		}
		
//		for(int in: Posiciones) {
//			String[] Lista = ListaNombres[in].trim().split(" ");
//			if(Lista.length>1)
//			for(String var:Lista) {
//				for(int i = 0; i<Lista.length;i++) {
//					if(!var.equals(Lista[i])) {
//						contador++;
//						//System.out.println(var+" "+Lista[i]);
//					}
//						
//				}
//				
//			}
//		}
		System.out.println(contador);
			
	}
}
