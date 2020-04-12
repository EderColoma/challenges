package java_problems;

/**
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 */
public class StringReverse {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private StringReverse() {}

	/**
	 * Checks wether a word is a palindrome.
	 * @param word The word to be checked.
	 * @return tru, if the given word id a palindrome, false, otherwise.
	 */
	public static Boolean checkPalindrome(final String word) {
		return word.equals(reverse(word));
	}

	/**
	 * Reverses a string.
	 * 
	 * @param string The string to be reversed.
	 * @return The reversed string.
	 */
	public static String reverse(final String string) {
		final StringBuilder reversed = new StringBuilder();
		
		for(int i = string.length(); i > 0; i--) {
			reversed.append(string.substring(i, i-1));
		}
		
		return reversed.toString();
	}
	
}
