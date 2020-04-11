package challenges;

import static challenges.CountingValleys.countValleys;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link CountingValleys} class.
 */
public class CountingValleysTest {

	/**
	 * Tests the calculation of the number of valleys passed through.
	 */
	@Test
	public void countValleysTest() {
		assertEquals(1, countValleys(8, "UDDDUDUU"));
	}

}
