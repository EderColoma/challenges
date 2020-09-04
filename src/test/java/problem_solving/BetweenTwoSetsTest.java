package problem_solving;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link BetweenTwoSets} class.
 */
public class BetweenTwoSetsTest {
	
	/**
	 * Tests the determinationof how many numbers are between the two arrays.
	 */
	@Test
	public void getTotalXTest() {
		
		List<Integer> listA = Arrays.asList(2 ,4);
		List<Integer> listB = Arrays.asList(16 ,32, 96);
		
		assertEquals(3, BetweenTwoSets.getTotalX(listA, listB));
	}
	
}
