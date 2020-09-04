package problem_solving;

/**
 * Little Bobby loves chocolate. He frequently goes to his favorite  store, Penny Auntie, to buy them. 
 * They are having a promotion at Penny Auntie. If Bobby saves enough wrappers, he can turn them in for a free chocolate.
 * For example, Bobby has 15 to spend on bars of chocolate that cost 3 each. He can turn in 2 wrappers to receive another bar. 
 * Initially, he buys 5 bars and has 5 wrappers after eating them. He turns in 4 of them, leaving him with 1, for 2 more bars. 
 * After eating those two, he has 3 wrappers, turns in 2 leaving him with 1 wrapper and his new bar. Once he eats that one, he has 2 wrappers and turns them in for another bar. 
 * After eating that one, he only has 1 wrapper, and his feast ends. Overall, he has eaten 5 + 2 + 1 + 1 = 9 bars.
 * Return the number of chocolates Bobby can eat after taking full advantage of the promotion.
 */
public class ChocolateFeast {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private ChocolateFeast() {}

	/**
	 * Calculates the number of chocolates that can be eaten.
	 * 
	 * @param n The initial amount of money.
	 * @param c The cost of a chocolate bar.
	 * @param m The the number of wrappers he can turn in for a free bar.
	 * @return The number of chocolates that can be eaten.
	 */
	public static int chocolateFeast(int n, int c, int m) {
		int numberOfChocolates = 0;
		
		if(n > 0 && c > 0 && n > c) {
			
			int boughtChocolates = n / c;
			numberOfChocolates += boughtChocolates;
			int wrappers = boughtChocolates;
			
			if(m > 0) {
				while(wrappers >= m) {
					int exchangedChocolates = wrappers / m;
					numberOfChocolates += exchangedChocolates;
					wrappers = exchangedChocolates + (wrappers % m);
				}
			}
			
		}
		
		return numberOfChocolates;
	}

}
