package Clase3;

public class CombinatoriaString {

	static int count = 0;

	public static void printCombinations(String initial, String combined) {
		System.out.println(combined + " ");
		count++;
		for (int i = 0; i < initial.length(); i++) {
			printCombinations(initial.substring(i + 1), combined + initial.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCombinations("abcd", "");
		System.out.println(count - 1);
	}

}
