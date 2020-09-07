package problem_solving;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static problem_solving.BirthdayChocolate.getPossibleSegments;

import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link BirthdayCakeCandles} class.
 */
public class BirthdayChocolateTest {

	/**
	 * Tests the finding of how many ways the chocolate bar can be divided.
	 */
	@Test
	public void getPossibleSegmentsTest() {
		final List<Integer> chocolateBar = asList(2, 2, 1, 3, 2);
		assertEquals(2, getPossibleSegments(chocolateBar, 4, 2));
	}

}
