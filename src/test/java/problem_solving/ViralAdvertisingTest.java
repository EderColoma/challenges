package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link ViralAdvertising} class.
 */
public class ViralAdvertisingTest {

	/**
	 * Tests the calculation of how many people have liked the ad by the end of a given day.
	 */
	@Test
	public void calculateLikesTest() {
		assertEquals(24, ViralAdvertising.calculateLikes(5));
	}

	/**
	 * Calculates how many people have liked the ad by the end no day.
	 */
	@Test
	public void calculateLikesZeroDaysTest() {
		assertEquals(0, ViralAdvertising.calculateLikes(0));
	}
}
