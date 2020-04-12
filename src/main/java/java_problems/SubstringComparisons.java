package java_problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.
 */
public class SubstringComparisons {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private SubstringComparisons() {}
	
	/**
	 * Gets the smallest and largest subtrings.
	 */
	public static String getSmallestAndLargest(final String s, final int k) {
        String smallest = "";
        String largest = "";
        
        final List<String> substrings = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++) {
        	if(i + k <= s.length()) {
        		substrings.add(s.substring(i, i + k));
        	}
        }
        
        substrings.sort(null);
        
        if(!substrings.isEmpty()) {
        	smallest = substrings.get(0);
        	largest = substrings.get(substrings.size() - 1);
        }
        
        return smallest + "\n" + largest;
    }
	
}
