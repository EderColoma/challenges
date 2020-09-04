package problem_solving;

/**
 * We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. 
 * For example, if string s=haackkeerrannkk it does contain hackerrank, but s=haakkeerannkk does not. 
 * In the second case, the second r is missing. If we reorder the first string as hccaakkerraannkk, it no longer contains the subsequence due to ordering.
 */
public class HackerRankString {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private HackerRankString() {}
	
	/**
	 * Checks if the text contains the work hackerrank.
	 * 
	 * @param text The text to be verified.
	 * @return 
	 */
	public static String hackerrankInString(String text) {
		
        String expectedString = "hackerrank";
        if (text.length() < expectedString.length()) {
            return "NO";
        }
        
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (j < expectedString.length() && text.charAt(i) == expectedString.charAt(j)) {
                    j++;
            }
        }
 
        return (j == expectedString.length() ? "YES" : "NO");
		
	}
}
