package problem_solving;

/**
 * Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.
 * Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.
 * For example, if the string s='sbcsc' and n=10, the substring we consider is 'abcacabcac', the first 10 characters of her infinite string. There are 4 occurrences of a in the substring.
 */
public class RepeatedString {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private RepeatedString() {}
	
	/**
	 * Counts how many times the letter "a" appears in a string repeated until a given length.
	 *  
	 * @param s The string to be repeated.
	 * @param n The length of the string.
	 * @return How many times the letter "a" appears in the string.
	 */
	public static long repeatedString(String s, long n) {
		long repetitions = 0;
		
		int count = 0;
		while(count < n) {
			for(int  i = 0; i < s.length(); i++) {
				count++;
				if(s.charAt(i) == 'a') {
					repetitions++;
				}
				
				if(count >= n) {
					break;
				}
			}
		}
		
		return repetitions;
	}

}
