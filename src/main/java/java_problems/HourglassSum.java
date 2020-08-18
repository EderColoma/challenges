package java_problems;

/**
 * You are given a 6*6 2D array.
 * An hourglass in an array is a portion shaped like this:
 *
 * a b c
 *   d
 * e f g
 *
 * For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
 *
 * 1 1 1     1 1 0     1 0 0
 *   1         0         0
 * 1 1 1     1 1 0     1 0 0
 *
 * The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
 * In this problem you have to print the largest sum among all the hourglasses in the array.
 */
public class HourglassSum {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private HourglassSum() {}

	/**
	 * Calculates the sum among the hourglasses in the array.
	 *
	 * @param arr The array to be verified.
	 * @return The highest sum among the hourglasses in the array.
	 */
	public static Long calculateLargestHourglass(int[][] arr) {
		Long largestSum = Long.MIN_VALUE;
		Long currentSum;

		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(i < 4 && j < 4) {
					currentSum = sumHourglass(arr, i, j);
					largestSum = currentSum > largestSum ? currentSum : largestSum;
				}
			}
		}

		return largestSum;
	}

	/**
	 *Calculates the sum of an hourglass.
	 *
	 * @param arr The array containing the hourglass.
	 * @param lineIndex The start X index of the hourglass in the array.
	 * @param columnIndex The start Y index of the hourglass in the array.
	 * @return The sum of the numbers forming the hourglass.
	 */
	private static Long sumHourglass(int[][] arr, int lineIndex, int columnIndex) {
		final Long sumFirstLine = Long.valueOf(arr[lineIndex][columnIndex] + arr[lineIndex][columnIndex+1] + arr[lineIndex][columnIndex+2]);
		final Long neck = Long.valueOf(arr[lineIndex+1][columnIndex+1]);
		final Long sumLastLine = Long.valueOf(arr[lineIndex+2][columnIndex] + arr[lineIndex+2][columnIndex+1] + arr[lineIndex+2][columnIndex+2]);
		return Long.valueOf(sumFirstLine + neck + sumLastLine);
	}

}
