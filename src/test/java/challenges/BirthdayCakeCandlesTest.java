package challenges;

import static challenges.BirthdayCakeCandles.birthdayCakeCandles;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link BirthdayCakeCandles} class.
 */
public class BirthdayCakeCandlesTest {

	/**
	 * Tests the counting of how many candles can be blown.
	 */
	@Test
	public void birthdayCakeCandlesTest() {
		
		int ar[] = {1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 2, 5 ,6};
		assertEquals(4, birthdayCakeCandles(ar));
		
	}
	
}
