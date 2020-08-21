package problem_solving;

import java.util.ArrayList;
import java.util.List;

/**
 * An integer d is a divisor of an integer n if the remainder of d / n = 0.
 * Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.
 * 
 * Note: Each digit is considered to be unique, so each occurrence of the same digit should be counted (e.g. for 111, 1 is a divisor of 111 each time it occurs so the answer is 3).
 */
public class FindDigits {
	
	private FindDigits() {}
	
	/**
	 * Counts the number of divisors occurring within the integer.
	 * 
	 * @param The number to be checked.
	 * @return The number of divisors.
	 */
	public static int findDigits(int n) {
		Integer value = Integer.valueOf(n);
		
		List<Integer> digits = new ArrayList<>();
		while(value.toString().length() > 1) {
			digits.add(value % 10);
			value = value / 10;
		}
		
		digits.add(value);
		
		return (int) digits.stream().filter(d -> d > 0 && n % d == 0).count();
		
	}

}
