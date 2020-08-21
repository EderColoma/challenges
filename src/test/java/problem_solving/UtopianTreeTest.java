package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.UtopianTree.calculateGrowth;

import org.junit.Test;

/**
 * Tests the methods of the {@link UtopianTree} class.
 */
public class UtopianTreeTest {

	/**
	 * Tests the calculation of the growth of a tree which passed trough 0 growth cycles.
	 */
	@Test
	public void zeroCyclesTest() {
		assertEquals(1, calculateGrowth(0));
	}
	
	/**
	 * Tests the calculation of the growth of a tree which passed trough 1 growth cycles.
	 */
	@Test
	public void oneCycleTest() {
		assertEquals(2, calculateGrowth(1));
	}
	
	/**
	 * Tests the calculation of the growth of a tree which passed trough 4 growth cycles.
	 */
	@Test
	public void fourCycleTest() {
		assertEquals(7, calculateGrowth(4));
	}
	
}
