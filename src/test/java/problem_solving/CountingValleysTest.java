package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.CountingValleys.countValleys;

import org.junit.Test;

import problem_solving.CountingValleys;

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
