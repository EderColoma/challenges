package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.CutSticks.cutTheSticks;

import org.junit.Test;

/**
 * Tests the methods of the {@link CutSticks} class.
 */
public class CutSticksTest {

	/**
	 * Tests the counting of the number of sticks that are left before each iteration.
	 */
	@Test
	public void cutTheSticksTest() {
		int[] sticks = {5, 4, 4, 2, 2, 8};
		int[] leftSticks = cutTheSticks(sticks);
				
		assertEquals(4, leftSticks.length);
		assertEquals(6, leftSticks[0]);
		assertEquals(4, leftSticks[1]);
		assertEquals(2, leftSticks[2]);
		assertEquals(1, leftSticks[3]);
	}
	
	/**
	 * Tests the counting of the number of sticks that are left before each iteration when there are no sticks.
	 */
	@Test
	public void cutTheSticksNoSticksTest() {
		int[] sticks = {};
		assertEquals(0, cutTheSticks(sticks).length);
	}
	
}
