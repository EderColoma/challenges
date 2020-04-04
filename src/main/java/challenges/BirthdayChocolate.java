package challenges;

import java.util.List;

/**
 * Lily has a chocolate bar that she wants to share it with Ron for his birthday. 
 * Each of the squares has an integer on it. She decides to share a contiguous segment of the bar selected such that 
 * the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. 
 * You must determine how many ways she can divide the chocolate.
 * Consider the chocolate bar as an array of squares, s = [2, 2, 1, 3, 2].
 * She wants to find segments summing to Ron's birth day, d = 4 with a length equaling his birth month, m = 2.
 * In this case, there are two segments meeting her criteria: [2, 2] and [1, 3].
 */
public class BirthdayChocolate {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private BirthdayChocolate() {}
	
	/**
	 * Find how many ways the chocolate bar can be divided.
	 * 
	 * @param s The chocolate bar.
	 * @param d Day of birth.
	 * @param m Month of birth.
	 * @return The number of ways the chocolate bar can be divided.
	 */
	public static int getPossibleSegments(final List<Integer> s, final int d, final int m) {
		int numberOfPossibleSegments = 0;
		
		for(int i = 0; i < s.size(); i++) {
			if(i + m <= s.size()) {
				final List<Integer> segment = s.subList(i, (i + m));
				if(segment.stream().reduce(0, Integer::sum).equals(d)) {
					numberOfPossibleSegments++;
				}
			}
		}
		
		return numberOfPossibleSegments;
	}
	
}
