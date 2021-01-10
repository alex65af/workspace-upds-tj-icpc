package Clase2;

public class BinarySearch_MasCercano {

	public static int n;
	public static int A[] = { 1, 3, 4, 9, 47 };

	public static int binarySearch(int inicio, int fin, int valor) {
		int mid, i;
		while (inicio <= fin) {
			if (A[inicio] > valor)
				return inicio;
			if (A[fin] <= valor)
				return fin + 1;
			mid = (inicio + fin) / 2;
			if (A[mid] > valor)
				fin = mid - 1;
			else if (A[mid] < valor)
				inicio = mid + 1;
			else if (A[mid] == valor) {
				for (i = mid + 1; i < n; i++)
					if (valor != A[i])
						return i;
				return i;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = A.length;
		System.out.println(binarySearch(0, A.length - 1, 46));
	}

}
