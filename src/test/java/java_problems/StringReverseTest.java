package java_problems;

import static java_problems.StringReverse.checkPalindrome;
import static java_problems.StringReverse.reverse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests the methods of the {@link StringReverse} class.
 */
public class StringReverseTest {

	/**
	 * Tests the reversing of a string.
	 */
	@Test
	public void reverseTest() {
		assertEquals("esrever", reverse("reverse"));
	}
	
	/**
	 * Tests the verification of a palindrome.
	 */
	@Test
	public void checkPalindromeTest() {
		assertTrue(checkPalindrome("madam"));
	}
}
