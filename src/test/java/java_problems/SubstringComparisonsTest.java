package java_problems;

import static java_problems.SubstringComparisons.getSmallestAndLargest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java_problems.SubstringComparisons;

/**
 * Tests the methods of the {@link SubstringComparisons} class.
 */
public class SubstringComparisonsTest {

	/**
	 * Tests the finding of the smallest and largest subtrings.
	 */
	@Test
	public void getSmallestAndLargestTest(){
		final String string = "welcometojava";
		assertEquals("ava\nwel", getSmallestAndLargest(string, 3));	
	}
	
}
