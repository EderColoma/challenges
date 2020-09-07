package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link SaveThePrisoner} class.
 */
public class SaveThePrisonerTest {

	/**
	 * Tests the finding of the unlucky prisoner.
	 */
	@Test
	public void findUnluckyPrisonerTest() {
		assertEquals(3, SaveThePrisoner.findUnluckyPrisoner(4, 6, 2));
	}

	/**
	 * Tests the finding of the unlucky prisoner when there are no candies.
	 */
	@Test
	public void findUnluckyPrisonerNoCandiesTest() {
		assertEquals(0, SaveThePrisoner.findUnluckyPrisoner(4, 0, 2));
	}
}
