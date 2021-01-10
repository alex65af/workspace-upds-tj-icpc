package Clase2;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

	public static int BinarySearchIterativo(int array[], int inicio, int fin, int objetivo) {
		while (inicio <= fin) {
			int mid = inicio + (fin - inicio) / 2;
			if (array[mid] == objetivo)
				return mid;
			if (array[mid] < objetivo)
				inicio = mid + 1;
			else
				fin = mid - 1;
		}
		return -1;
	}

	public static int BinarySearchRecursivo(int array[], int inicio, int fin, int objetivo) {
		if (fin >= inicio) {
			int mid = inicio + (fin - inicio) / 2;
			if (array[mid] == objetivo) {
				return mid;
			}
			if (array[mid] > objetivo) {
				return BinarySearchRecursivo(array, inicio, mid - 1, objetivo);
			}

			return BinarySearchRecursivo(array, mid + 1, fin, objetivo);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 5, 10, 43, 101, 202 };
		int obj = 101;
		// int resultado = BinarySearchRecursivo(a, 0, a.length - 1, obj);
		int resultado = BinarySearchIterativo(a, 0, a.length - 1, obj);
		if (resultado == -1)
			System.out.println("No se a entontrado");
		else
			System.out.println(resultado);

		Scanner sc = new Scanner(System.in);
		
		int x[] = { 0, 3, 5, 6, 8, 9, 10, 11 };
		System.out.println(Arrays.binarySearch(x, sc.nextInt()));
	}

}
