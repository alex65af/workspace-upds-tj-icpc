package Clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arreglos
////		 nombre_array[];
////		tipo_dato nombre_array = new tipo_dato[tamanio];
//
//		int[] arreglo = new int[6];
//////		 0 1 2 3 4 5 
//////		|0|0|0|0|0|0|
////
//		arreglo[0] = 1;
//////		 0 1 2 3 4 5 
//////		|1|0|0|0|0|0|
////		
//		arreglo[1] = 2;
//////		 0 1 2 3 4 5 
//////		|1|2|0|0|0|0|
////		
//		arreglo[2] = 3;
//////		 0 1 2 3 4 5 
//////	 	|1|2|3|0|0|0|
////		
//		arreglo[3] = 4;
//////		 0 1 2 3 4 5 
//////	 	|1|2|3|4|0|0|
////		
//		arreglo[4] = 5;
//////		 0 1 2 3 4 5 
//////	 	|1|2|3|4|5|0|
////		
//		arreglo[5] = 6;
//////		 0 1 2 3 4 5 
//////	 	|1|2|3|4|5|6|
//
//		System.out.println(arreglo[0]);
//		System.out.println(arreglo[1]);
//		System.out.println(arreglo[2]);
//		System.out.println(arreglo[3]);
//		System.out.println(arreglo[4]);
//		System.out.println(arreglo[5]);

//		char[] arreglo = {'a','b','c','d','1','2','3','4','+','$'};
//////				 0 1 2 3 4 5 6 7 8 9
//////				|a|b|c|d|1|2|3|4|+|$|
////		
//		System.out.println(arreglo[0]);
//		System.out.println(arreglo[1]);
//		System.out.println(arreglo[2]);
//		System.out.println(arreglo[3]);
//		System.out.println(arreglo[4]);
//		System.out.println(arreglo[5]);
//		System.out.println(arreglo[6]);
//		System.out.println(arreglo[7]);
//		System.out.println(arreglo[8]);
//		System.out.println(arreglo[9]);
//		

//		Scanner sc = new Scanner(System.in);
//		int n;
//		n = sc.nextInt();
//		int[] arreglo = new int[n];
//		for (int i = 0; i < n; i++) {
//			arreglo[i] = sc.nextInt();
//		}
////		
//		System.out.println("For");
//		for (int i = 0; i < n; i++) {
//			System.out.println(arreglo[i]);
//		}
//		System.out.println();
////
//		System.out.println("Foreach");
//		for (int var : arreglo) {
//			System.out.println(var);
//		}
//		System.out.println();
////		
//		System.out.println("While");
//		int contador = 0;
//		while (contador < n) {
//			System.out.println(arreglo[contador]);
//			contador++;
//		}
//		System.out.println();

//		String cadena = "Programación en Java";
//		char[] arreglo = cadena.toCharArray(); 
//		for(char letra:arreglo) {
//			System.out.print(letra + " ");
//		}

		//copiar arreglos
	//	char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
//        char[] copyTo = new char[7];
////
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        System.out.println(new String(copyTo));
		
//        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
//                'i', 'n', 'a', 't', 'e', 'd'};
//                
//        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
//            
//        System.out.println(new String(copyTo));
		
		
		//// Matrices o arreglos
		// Tipo_dato nombre_array[][];
		// nombre_array = new tipo_dato[tamanio][tamanio];
//		
//		int[][] matriz = new int [2][2];
//////		 0 1		
//////	  0	|0|0|
//////	  1	|0|0|
//
//		matriz[0][0]=1;
//////		 0 1		
//////	  0	|1|0|
//////	  1	|0|0|
////		
//		matriz[0][1]=2;
//////		 0 1		
//////	  0	|1|2|
//////	  1	|0|0|
////		
//		matriz[1][0]=3;
//////		 0 1		
//////	  0	|1|2|
//////	  1	|3|0|
////		
//		matriz[1][1]=4;
//////		 0 1		
//////	  0	|1|2|
//////	  1	|3|4|
////		
//		for(int i=0;i<2;i++) {
//			for(int j=0; j<2;j++) {
//				System.out.print(matriz[i][j]+" ");
//			}
//			System.out.println();
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		int m = sc.nextInt();
//		int[][]matriz = new int  [n][m];
//		
//		for(int i=0; i<n;i++) {
//			for(int j = 0; j<m;j++) {
//				matriz[i][j]=sc.nextInt();
//			}
//		}

//		char[][] matriz = { { 'a', 'b', 'c', 'd' }, { '1', '2', '3', '4' } };
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[i].length; j++) {
//				System.out.print(matriz[i][j] + " ");
//				
//			}
//			System.out.println();
//		}

		
		
		//Listas
		
		// Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
//		ArrayList<String> nombreArrayList = new ArrayList<String>();
//		
//		// Añade el elemento al ArrayList
//		nombreArrayList.add("Elemento");
//		
//		// Añade el elemento al ArrayList en la posición 'n'
//		nombreArrayList.add(0, "Elemento 2");
//		
//		// Devuelve el numero de elementos del ArrayList
//		nombreArrayList.size();
//		
//		// Devuelve el elemento que esta en la posición '2' del ArrayList
//		nombreArrayList.get(2);
//		
//		// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
//		nombreArrayList.contains("Elemento");
//		
//		// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
//		nombreArrayList.indexOf("Elemento");
//		
//		// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
//		nombreArrayList.lastIndexOf("Elemento");
//		
//		// Borra el elemento de la posición '5' del ArrayList   
//		nombreArrayList.remove(5); 
//		
//		// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
//		nombreArrayList.remove("Elemento");
//		
//		//Borra todos los elementos de ArrayList   
//		nombreArrayList.clear();
//		
//		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
//		nombreArrayList.isEmpty();  
//		
//		// Copiar un ArrayList 
//		ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
//		
//		// Pasa el ArrayList a un Array 
//		Object[] array = nombreArrayList.toArray();   
//		
//		//Modifica un elemento en la posicion 'n'
//		nombreArrayList.set(0,"Remplazo");
		
		
//		ArrayList<Integer> lista = new ArrayList<Integer>();
//		lista.add(654);
//		lista.add(5);
//		lista.add(4);
//		lista.add(123);
//		lista.add(0, 100); //(Posicion, Valor)
////		
//		lista.set(2, 20);
////		
////		//Metodo de ordenamiento
//		Collections.sort(lista);
////		
//		for(int var: lista) {
//			System.out.println(var);
//		}
//		
        
//        TreeSet<Integer> treeset = new TreeSet<Integer>();
//        treeset.add(5);
//        treeset.add(2);
//        treeset.add(6);
//        treeset.add(5);
//        treeset.add(10);
//        treeset.add(20);
//        treeset.add(10);
//        treeset.add(2);
//        treeset.add(1);
//        System.out.println(treeset.higher(19));
//        System.out.println(treeset.lower(1));
////        System.out.println(treeset.lower(9));
//        System.out.println();
//        for (Integer var : treeset) {
//			System.out.println(var);
//		}
//      Metodos de TreeSet
//      add(n)			Añadir elemento
//      clear			Remover todos los elementos en el set
//      constains(n)	Retorna true si el elemento especificados existe en este set
//      isEmpty			Retorna true si el set no contiene elementos
//      remove(n)		Remueve el elemento especificado
//      size			Retorna el numero de elementos en el set
//      first			Retorna el primer elemento existente en el set
//		higher(n) 		Retorna un elemento superior al elemente especificado/Si no existe un elemento superior retorna null
//      lower(n)		Retorna un elemento inferior al elemente especificado/Si no existe un elemento inferior retorna null
//      pollFirst		Retorna y elimina de la lista el primer elemento
//      pollLast		Retorna y elimina de la lista el ultimo elemento
        
        
        
        
//        HashSet<String> hashset = new HashSet<String>();
//		hashset.add("Al");
//		hashset.add("AB");
//		hashset.add("AC");
//		hashset.add("AN");
//		hashset.add("AB");
//		hashset.add("AD");
//		hashset.add("AJ");
//		hashset.add("AR");
//		hashset.add("AT");
//		hashset.add("AU");
//		hashset.add("AK");
//		hashset.add("AK");
//		hashset.add("AU");
////		
//		for (String item : hashset) {
//			System.out.println(item);
//		}
//        Metodos de HashSet
//        add			Añadir elemento
//        clear			Remover todos los elementos en el set
//        constains		Retorna true si el elemento especificados existe en este set
//        isEmpty		Retorna true si el set no contiene elementos
//        remove		Remueve el elemento especificado
//        size			Retorna el numero de elementos en el set
        
	}
}
