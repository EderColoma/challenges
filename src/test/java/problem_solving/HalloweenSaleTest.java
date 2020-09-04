package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link HalloweenSale} class.
 */
public class HalloweenSaleTest {
	
	/**
	 * Tests how many games can be bought.
	 */
	@Test
	public void howManyGamesTest() {
		assertEquals(6, HalloweenSale.howManyGames(20, 3, 6, 80));
	}

	/**
	 * Tests how many games can be bought with no money.
	 */
	@Test
	public void howManyGamesNoMoneyTest() {
		assertEquals(0, HalloweenSale.howManyGames(20, 3, 6, 0));
	}
	
	/**
	 * Tests how many games can be bought with less money then the price of a game.
	 */
	@Test
	public void howManyGamesNotEnoughMoneyTest() {
		assertEquals(0, HalloweenSale.howManyGames(20, 3, 6, 18));
	}
	
	/**
	 * Tests how many games can be bought.
	 */
	@Test
	public void howManyGamesLotsOfMoneyTest() {
		assertEquals(3905, HalloweenSale.howManyGames(99, 3, 1, 5555));
	}

}
