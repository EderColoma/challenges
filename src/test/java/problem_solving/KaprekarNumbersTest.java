package problem_solving;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link JumpingOnTheClouds} class.
 */
public class KaprekarNumbersTest {

	/**
	 * Tests the finding of Kaprekar numbers in a given range.
	 */
	@Test
	public void findKaprekarNumbersTest() {
		List<Integer> foundNumbers = KaprekarNumbers.findKaprekarNumbers(1, 100);
		
		assertEquals(5, foundNumbers.size());
		assertTrue(foundNumbers.contains(1));
		assertTrue(foundNumbers.contains(9));
		assertTrue(foundNumbers.contains(45));
		assertTrue(foundNumbers.contains(55));
		assertTrue(foundNumbers.contains(99));
	}
	
	/**
	 * Tests the finding of Kaprekar numbers in a given range.
	 */
	@Test
	public void findKaprekarNumbersHugeNumbersTest() {
		List<Integer> foundNumbers = KaprekarNumbers.findKaprekarNumbers(1, 99999);
		
		assertEquals(21, foundNumbers.size());
		assertTrue(foundNumbers.contains(1));
		assertTrue(foundNumbers.contains(9));
		assertTrue(foundNumbers.contains(45));
		assertTrue(foundNumbers.contains(55));
		assertTrue(foundNumbers.contains(99));
		assertTrue(foundNumbers.contains(297));
		assertTrue(foundNumbers.contains(703));
		assertTrue(foundNumbers.contains(999));
		assertTrue(foundNumbers.contains(2223));
		assertTrue(foundNumbers.contains(2728));
		assertTrue(foundNumbers.contains(4950));
		assertTrue(foundNumbers.contains(7272));
		assertTrue(foundNumbers.contains(7777));
		assertTrue(foundNumbers.contains(9999));
		assertTrue(foundNumbers.contains(17344));
		assertTrue(foundNumbers.contains(22222));
		assertTrue(foundNumbers.contains(77778));
		assertTrue(foundNumbers.contains(82656));
		assertTrue(foundNumbers.contains(95121));
		assertTrue(foundNumbers.contains(99999));
	}
	
}
