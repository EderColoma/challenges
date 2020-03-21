package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Anna and Brian are sharing a meal at a restuarant and they agree to split the bill equally.
 * Brian wants to order something that Anna is allergic to though, and they agree that Anna won't pay for that item. 
 * Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.
 * For example, assume the bill has the following prices: bill = [1, 4, 6].
 * Anna declines to eat item which costs 6. If Brian calculates the bill correctly, Anna will pay 3. 
 * If he includes the cost of 6, he will calculate 6. In the second case, he should refund 3 to Anna.
 * 
 * It should print Bon Appetit if the bill is fairly split. 
 * Otherwise, it should print the integer amount of money that Brian owes Anna
 */
public class BonAppetit {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private BonAppetit() {}

	/**
	 * Checks whether the bill was fairly split.
	 * @param bill The prices of ordered items.
	 * @param k The item which was not eaten.
	 * @param b The paid value.
	 */
	public static void bonAppetit(final List<Integer> bill, final int k, final int b) {
		final Integer fairAmount = calcutateFairSplit(bill, k);
		System.out.println(fairAmount.equals(Integer.valueOf(b)) ? "Bon Appetit" : Integer.valueOf(b) - fairAmount);
    }
	
	/**
	 * Calculates the fair split value.
	 * 
	 * @param bill The prices of ordered items.
	 * @param k The item which was not eaten.
	 * @return The fair value which each person should pay.
	 */
	private static Integer calcutateFairSplit(final List<Integer> bill, final int k) {
		final List<Integer> billWithoutItem = new ArrayList<>();
		billWithoutItem.addAll(bill);
		billWithoutItem.remove(k);
		
		return calculateSimpleSplit(billWithoutItem);
	}
	
	/**
	 * Calculates the simple split of the bill.
	 * 
	 * @param bill The price of ordered items.
 	 * @return The value which each person should pay if the bill was evenly split.
	 */
	private static Integer calculateSimpleSplit(final List<Integer> bill) {
		return bill.isEmpty() ? 0 : (bill.stream().reduce(0, Integer::sum)) / 2;
	}
}
