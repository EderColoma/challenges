package problem_solving;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

/**
 * Tests the methods of the {@link AppleAndOrange} class.
 */
public class AppleAndOrangeTest {

	/**
	 * Tests the counting of how many apples and oranges will fall on Sam's house.
	 */
	@Test
	public void countApplesAndOrangesTest() {
		int[] apples = {-2, 2, 1};
		int[] oranges = {5, -6, -7};
		Map<String, Integer> result = AppleAndOrange.countApplesAndOranges(7, 11, 5, 15, apples, oranges);
		
		assertEquals(Integer.valueOf(1), result.get("apple"));
		assertEquals(Integer.valueOf(2), result.get("orange"));
	}
	
}
