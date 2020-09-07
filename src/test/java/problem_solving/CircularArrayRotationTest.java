package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.CircularArrayRotation.getArrayValues;

import org.junit.Test;

/**
 * Tests the methods of the {@link CircularArrayRotation} class.
 */
public class CircularArrayRotationTest {

	/**
	 * Tests the obtaining of array values after rotations.
	 */
	@Test
	public void getArrayValuesTest() {
		final int[] array = {3, 4, 5};
		final int[] queries = {1, 2};
		final int[] values = getArrayValues(array, 2, queries);

		assertEquals(5, values[0]);
		assertEquals(3, values[1]);
	}

}
