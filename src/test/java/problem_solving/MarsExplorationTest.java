package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link MarsExploration} class.
 */
public class MarsExplorationTest {

	/**
	 * Tests the counting of changed characters in a message.
	 */
	@Test
	public void countChangedCharactersTest() {
		assertEquals(2, MarsExploration.countChangedCharacters("SOSSTT"));
	}
	
	/**
	 * Tests the counting of changed characters in a message, when no characters where changed.
	 */
	@Test
	public void countChangedCharactersNoChangesTest() {
		assertEquals(0, MarsExploration.countChangedCharacters("SOSSOSSOS"));
	}
}
