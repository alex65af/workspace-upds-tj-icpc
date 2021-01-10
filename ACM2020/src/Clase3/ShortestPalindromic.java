package Clase3;

public class ShortestPalindromic {

	// Function return the shortest
	// palindromic subString
	static char ShortestPalindrome(String s) {
		int n = s.length();
		char ans = s.charAt(0);

		// Finding the smallest character
		// present in the String
		for (int i = 1; i < n; i++) {
			ans = (char) Math.min(ans, s.charAt(i));
		}
		return ans;
	}

	// Driver code
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		System.out.print(ShortestPalindrome(s));
	}
}

// This code is contributed by Rajput-Ji