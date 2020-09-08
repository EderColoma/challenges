package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link JumpingOnTheClouds} class.
 */
public class JumpingOnTheCloudsTest {
	
	/**
	 * Tests the finding of the amount of energy left after arriving at cloud 0.
	 */
	@Test
	public void jumpingOnCloudsTest() {
		int[] clouds = {0, 0, 1, 0};
		assertEquals(96, JumpingOnTheClouds.jumpingOnClouds(clouds, 2));
	}
	

}
