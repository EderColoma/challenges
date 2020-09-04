package problem_solving;

/**
 * You wish to buy video games from the famous online video game store Mist.
 * Usually, all games are sold at the same price, p dollars. However, they are planning to have the seasonal Halloween Sale next month in which you can buy games at a cheaper price. 
 * Specifically, the first game you buy during the sale will be sold at p dollars, but every subsequent game you buy will be sold at exactly d dollars less than the cost of the previous one you bought. 
 * This will continue until the cost becomes less than or equal to m dollars, after which every game you buy will cost  dollars each.
 * 
 * You have s dollars in your Mist wallet. How many games can you buy during the Halloween Sale?
 */
public class HalloweenSale {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private HalloweenSale() {}

	/**
	 * Calculates how many games can be bought.
	 * 
	 * @param p The price without discount.
	 * @param d The discount for other games.
	 * @param m The minimum price.
	 * @param s The value available to spend on games.
	 * @return The number of games you can buy.
	 */
	public static int howManyGames(int p, int d, int m, int s) {
		int games = 0;
		int remainingMoney = s;
		int actualPrice = p;
		
		while(remainingMoney > 0) {
			if(remainingMoney - actualPrice >= 0) {
				games++;
				remainingMoney -= actualPrice;
				actualPrice = actualPrice - d > m ? actualPrice - d : m;
			}else {
				remainingMoney = 0;
			}
		}
		
		return games;
    }
	
}
