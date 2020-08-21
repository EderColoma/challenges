package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link FindDigits} class.
 */
public class FindDigitsTest {

	/**
	 * Tests the counting the number of divisors occurring within the integer.
	 */
	@Test
	public void findDigitsTest() {
		assertEquals(3, FindDigits.findDigits(1012));
	}
	
}
