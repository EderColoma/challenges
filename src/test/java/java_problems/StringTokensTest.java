package java_problems;

import static java_problems.StringTokens.extractTokens;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link StringReverse} class.
 */
public class StringTokensTest {

	/**
	 * Tests the extraction of tokens from a text.
	 */
	@Test
	public void extractTokensTest() {
		final String s = "He is a very very good boy, isn't he?";
		final List<String> tokens = extractTokens(s);
		
		assertEquals(10, tokens.size());
		assertEquals("He", tokens.get(0));
		assertEquals("is", tokens.get(1));
		assertEquals("a", tokens.get(2));
		assertEquals("very", tokens.get(3));
		assertEquals("very", tokens.get(4));
		assertEquals("good", tokens.get(5));
		assertEquals("boy", tokens.get(6));
		assertEquals("isn", tokens.get(7));
		assertEquals("t", tokens.get(8));
		assertEquals("he", tokens.get(9));
	}

	/**
	 * Tests the extraction of tokens from an empty text.
	 */
	@Test
	public void extractTokensEmptyTest() {
		final List<String> tokens = extractTokens("");
		
		assertTrue(tokens.isEmpty());
	}
	
	/**
	 * Tests the extraction of tokens from a null text.
	 */
	@Test
	public void extractTokensNullTest() {
		final List<String> tokens = extractTokens(null);
		
		assertTrue(tokens.isEmpty());
	}
	
	/**
	 * Tests the extraction of tokens from a text with multiple blank spaces.
	 */
	@Test
	public void extractTokensMultipleSpacesTest() {
		final String s = "                a                    \r\n";
		final List<String> tokens = extractTokens(s);
		
		assertEquals(1, tokens.size());
		assertEquals("a", tokens.get(0));
	}
}
