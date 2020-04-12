package problem_solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Monica wants to buy a keyboard and a USB drive from her favorite electronics store. The store has several models of each. 
 * Monica wants to spend as much as possible for the 2 items, given her budget.
 * Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the amount of money Monica will spend. 
 * If she doesn't have enough money to both a keyboard and a USB drive, print -1 instead. She will buy only the two required items.
 */
public class ElectronicsShop {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private ElectronicsShop() {}
	
	/**
	 * Finds the maximum money possible to spend on the items.
	 * @param keyboards The prices of keyboards. 
	 * @param drives The prices of USB drives.
	 * @param b The money available to spend.
	 * @return The maximum money possible to spend on the items.
	 */
	static int getMoneySpent(final int[] keyboards, final int[] drives, final int b) {
		final List<Integer> totalPrices = new ArrayList<>();
		
		for(int i = 0; i < keyboards.length; i++) {
			for(int j = 0; j < drives.length; j++) {
				final Integer totalPrice  = keyboards[i] + drives[j];
				if(totalPrice <= b) {
					totalPrices.add(keyboards[i] + drives[j]);
				}
			}
		}
		
		totalPrices.sort(null);
		return totalPrices.isEmpty() ? -1 : totalPrices.get(totalPrices.size() - 1);
    }	 

}
