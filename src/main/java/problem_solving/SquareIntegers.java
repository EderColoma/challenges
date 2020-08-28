package problem_solving;

/**
 * Provided a starting and ending value describing a range of integers. Determine the number of square integers within that range, inclusive of the end points.
 */
public class SquareIntegers {

	private SquareIntegers() {}
	
	/**
	 * Counts the square integers within a range.
	 * @param a The starting number.
	 * @param b The ending number.
	 * @return The amount of square integers within the given range.
	 */
	public static int countSquareIntegers(int a, int b) {
		int count = 0;
		
		for(int i = a; i <= b; i++) {
			double sqrt = Math.sqrt(i);
			if(Math.ceil(sqrt) == sqrt) {
				count++;
			}
		}
		
		return count;
	}
	
}
