package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link ChocolateFeast} class.
 */
public class ChocolateFeastTest {

	/**
	 * Tests the calculation the number of chocolates that can be eaten.
	 */
	@Test
	public void chocolateFeastTest() {
		assertEquals(5, ChocolateFeast.chocolateFeast(6, 2, 2));
	}
	
	/**
	 * Tests the calculation the number of chocolates that can be eaten without money.
	 */
	@Test
	public void chocolateFeastNoMoneyTest() {
		assertEquals(0, ChocolateFeast.chocolateFeast(0, 2, 5));
	}
	
	/**
	 * Tests the calculation the number of chocolates that can be eaten without the promotion.
	 */
	@Test
	public void chocolateFeastNoPromotionTest() {
		assertEquals(5, ChocolateFeast.chocolateFeast(10, 2, 0));
	}
}
