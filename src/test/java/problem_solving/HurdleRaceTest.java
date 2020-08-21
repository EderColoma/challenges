package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.HurdleRace.getPotionDoses;

import org.junit.Test;

/**
 * Tests the methods of the {@link HurdleRace} class.
 */
public class HurdleRaceTest {

	/**
	 * Tests the calculation of the number of doses needed when no dose is needed.
	 */
	@Test
	public void getPotionDosesNoDosesNeededTest() {
		int[] hurdles = {1, 2, 1, 1, 2, 2, 1};
		assertEquals(0, getPotionDoses(2, hurdles));
	}
	
	/**
	 * Tests the calculation of the number of doses needed when three doses are needed.
	 */
	@Test
	public void getPotionDosesTest() {
		int[] hurdles = {2, 2, 1, 3, 4, 2, 1};
		assertEquals(3, getPotionDoses(1, hurdles));
	}
	
}
