package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link SquareIntegers} class.
 */
public class SquareIntegersTest {

	/**
	 * Tests the counting of square integers within a given range.
	 */
	@Test
	public void countSquareIntegersTest() {
		assertEquals(3, SquareIntegers.countSquareIntegers(24, 49));
	}
	
	/**
	 * Tests the counting of square integers within a given range when there are no square integers.
	 */
	@Test
	public void countSquareIntegersNoOccurrencesTest() {
		assertEquals(0, SquareIntegers.countSquareIntegers(17, 24));
	}
	
}
