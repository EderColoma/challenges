package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link HackerRankString} class.
 */
public class HackerRankStringTest {

	/**
	 * Tests if the text contains the work hackerrank, when it contains.
	 */
	@Test
	public void hackerrankInStringTest() {
		assertEquals("YES", HackerRankString.hackerrankInString("haackkeerrannkk"));
	}
	
	/**
	 * Tests if the text contains the work hackerrank, when a letter is missing.
	 */
	@Test
	public void hackerrankInStringMissingLetterTest() {
		assertEquals("NO", HackerRankString.hackerrankInString("haakkeerannkk"));
	}
	
	/**
	 * Tests if the text contains the work hackerrank, when a letter is ou of position.
	 */
	@Test
	public void hackerrankInStringOutOfPositionLetterTest() {
		assertEquals("NO", HackerRankString.hackerrankInString("aahckkeerrannkk"));
	}
	
}
