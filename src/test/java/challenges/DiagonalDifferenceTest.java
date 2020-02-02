package challenges;

import static  challenges.DiagonalDifference.diagonalDifference;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link DiagonalDifference} class.
 */
public class DiagonalDifferenceTest {

	/**
	 * Tests the calculation of the absolute difference between the sums of the diagonals of a square matrix.
	 */
	@Test
	public void diagonalDifferenceTest() {
		final List<Integer> firstLine = new ArrayList<>();
		firstLine.add(11);
		firstLine.add(2);
		firstLine.add(4);
		
		final List<Integer> secondLine = new ArrayList<>();
		secondLine.add(4);
		secondLine.add(5);
		secondLine.add(6);
		
		final List<Integer> thirdLine = new ArrayList<>();
		thirdLine.add(10);
		thirdLine.add(8);
		thirdLine.add(-12);
		
		final List<List<Integer>> arr = new ArrayList<>();
		arr.add(firstLine);
		arr.add(secondLine);
		arr.add(thirdLine);
		
		assertEquals(15, diagonalDifference(arr));
	}
	
}
