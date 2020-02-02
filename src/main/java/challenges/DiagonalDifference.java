package challenges;

import static java.lang.Math.abs;
import java.util.List;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals. 
 */
public class DiagonalDifference {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private DiagonalDifference() {}
	
	/**
	 * Calculate the absolute difference between the sums of the diagonals of a square matrix.
	 * 
	 * @param arr The matrix.
	 * @return The absolute difference between the sums of the diagonals of the square matrix.
	 */
	public static int diagonalDifference(List<List<Integer>> arr) {
		
		int firstDiagonalSum = 0;
		int secondDiagonalSum = 0;
		for(int i = 0; i < arr.size(); i++) {
			firstDiagonalSum += arr.get(i).get(i);
			secondDiagonalSum += arr.get(i).get(arr.size() - 1 - i);
		}
				
		
		return abs(firstDiagonalSum - secondDiagonalSum);
	}
	
}
