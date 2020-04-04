package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale. 
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * For example, there are n = 7 socks with colors ar = [1, 2, 1, 2, 1, 3, 2]. There is one pair of color and one of color.
 * There are three odd socks left, one of each color. The number of pairs is 2. 
 */
public class SockMerchant {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private SockMerchant() {}

	/**
	 * Calculates the amount of pairs of socks.
	 * @param n The quantity of socks.
	 * @param ar The socks' colors.
	 * @return The amount of pairs of socks.
	 */
	public static int getNumberOfMatchingPairs(final int n, final int[] ar){
		final Map<Integer, Integer> colorCount = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(colorCount.containsKey(Integer.valueOf(ar[i]))) {
				colorCount.replace(Integer.valueOf(ar[i]), colorCount.get(ar[i]) + 1);
			}else {
				colorCount.put(Integer.valueOf(ar[i]), Integer.valueOf(1));
			}
		}
		
		final List<Integer> pairsByColor = new ArrayList<>();
		colorCount.forEach((c, v) -> pairsByColor.add(v / 2));
		return pairsByColor.stream().reduce(0, Integer::sum);
	}
}
