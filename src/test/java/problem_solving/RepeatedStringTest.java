package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link RepeatedString} class.
 */
public class RepeatedStringTest {
	
	/**
	 * Tests the counting of 'a' in a string.
	 */
	@Test
	public void countRepeatedStringTest() {
		assertEquals(10000, RepeatedString.repeatedString("a", 10000));
	}

	/**
	 * Tests the counting of 'a' in a string with no 'a's.
	 */
	@Test
	public void countRepeatedStringNoATest() {
		assertEquals(0, RepeatedString.repeatedString("b", 10000));
	}

	/**
	 * Tests the counting of 'a' in a string mixed letters.
	 */
	@Test
	public void countRepeatedStringMixedLettersTest() {
		assertEquals(4, RepeatedString.repeatedString("abcac", 10));
	}

	
}
