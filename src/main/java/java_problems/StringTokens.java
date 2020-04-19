package java_problems;

import static  java.util.Arrays.asList;
import static java.util.Objects.isNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
 * We define a token to be one or more consecutive English alphabetic letters. 
 * Then, print the number of tokens, followed by each token on a new line.
 */
public class StringTokens {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private StringTokens() {}
	
	/**
	 * Extract all tokens from a text.
	 * 
	 * @param s The text which will have its tokens extracted.
	 * @return The extrcted tokens.
	 */
	public static List<String> extractTokens(final String s){
		final List<String> tokens = new ArrayList<>();

		if(!isNull(s) && !s.isBlank()) {
			tokens.addAll(asList(s.trim().split("[^A-Za-z]{1,}")));
		}
		
		return tokens;
	}	
}
