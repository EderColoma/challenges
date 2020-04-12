package challenges;

import static  challenges.ElectronicsShop.getMoneySpent;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link ElectronicsShop} class.
 */
public class ElectronicsShopTest {

	/**
	 * Tests the finding of the maximum money possible to spend on the items.
	 */
	@Test
	public void getMoneySpentTest() {
		final int[] keyboards = {40, 50, 60};
		final int[] drives = {5, 8, 12};
		
		assertEquals(58, getMoneySpent(keyboards, drives, 60));
	}

	/**
	 * Tests the finding of the maximum money possible to spend on the items when no item combinations is affordable.
	 */
	@Test
	public void getMoneySpentNotAffordableTest() {
		final int[] keyboards = {40, 50, 60};
		final int[] drives = {5, 8, 12};
		
		assertEquals(-1, getMoneySpent(keyboards, drives, 10));
	}
}
