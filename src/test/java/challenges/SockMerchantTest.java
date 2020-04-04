package challenges;

import static  challenges.SockMerchant.getNumberOfMatchingPairs;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link SockMerchant} class.
 */
public class SockMerchantTest {

	/**
	 * Tests the calculation the amount of pairs of socks.
	 */
	@Test
	public void getNumberOfMatchingPairsTest() {
		final int[] ar = {1, 2, 1, 2, 1, 3, 2};
		final int n = ar.length;
		
		assertEquals(2, getNumberOfMatchingPairs(n, ar));
	}

}