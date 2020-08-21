package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.EqualizeArray.equalizeArray;

import org.junit.Test;

/**
 * Tests the methods of the {@link EqualizeArray} class.
 */
public class EqualizeArrayTest {

	/**
	 * Tests the calculation of the minimum number of deletions to reduce an array until all remaining elements are equal.
	 */
	@Test
	public void equalizeArrayTest() {
		int[] arr = {3, 3, 2, 1, 3};
		assertEquals(2, equalizeArray(arr));
	}
	
	/**
	 * Tests the calculation of the minimum number of deletions to reduce an array until all remaining elements are equal 
	 * when the array has no elements.
	 */
	@Test
	public void equalizeEmptyArrayTest() {
		int[] arr = {};
		assertEquals(0, equalizeArray(arr));
	}
	
}
