package problem_solving;

/**
 * You are given an array of n integers, and a positive integer, k.
 * Find and print the number (i, j) of pairs where i < j and ar[i] + ar[j] is divisible by k.
 *
 */
public class DivisibleSumPairs {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private DivisibleSumPairs() {}

	/**
	 * Calculates the integer count of pairs in an array which sum is divisible by k.
	 *
	 * @param n The integer length of the array.
	 * @param k The integer to divide the pair sum by.
	 * @param ar An array of integers.
	 * @return The integer count of pairs in an array which sum is divisible by k
	 */
	public static int countSumPairs(int n, int k, int[] ar) {
		int result = 0;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i < j && ((ar[i] + ar[j]) % k) == 0) {
					result++;
				}
			}
		}

		return result;
	}

}
