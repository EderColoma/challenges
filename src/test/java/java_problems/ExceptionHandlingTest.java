package java_problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Tests the methods of the {@link ExceptionHandling} class.
 */
public class ExceptionHandlingTest {

	ExceptionHandling exceptionHandling = new ExceptionHandling();

	/**
	 * Tests the calculation with valid parameters.
	 */
	@Test
	public void powerTest() {
		try {
			assertEquals(8, exceptionHandling.power(2, 3));
		} catch (final Exception e) {
			fail();
		}
	}

	/**
	 * Tests the calculation with a negative N.
	 */
	@Test
	public void negativeNTest() {
		try {
			exceptionHandling.power(-2, 3);
		} catch (final Exception e) {
			assertEquals("n or p should not be negative", e.getMessage());
		}
	}

	/**
	 * Tests the calculation with a negative P.
	 */
	@Test
	public void negativePTest() {
		try {
			exceptionHandling.power(2, -3);
		} catch (final Exception e) {
			assertEquals("n or p should not be negative", e.getMessage());
		}
	}

	/**
	 * Tests the calculation with a zeroes.
	 */
	@Test
	public void zeroValuesTest() {
		try {
			exceptionHandling.power(0, 0);
		} catch (final Exception e) {
			assertEquals("n and p should not be zero", e.getMessage());
		}
	}
}
