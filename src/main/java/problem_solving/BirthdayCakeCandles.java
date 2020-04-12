package problem_solving;

/**
 * You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. 
 * When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.
 *
 * For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4, 4, 1, 3, she will be able to blow out 2 candles successfully, 
 * since the tallest candles are of height 4 and there are 2 such candles. 
 */
public class BirthdayCakeCandles {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private BirthdayCakeCandles() {}
	
    /**
     * Counts how many candles can be blown.
     * 
     * @param ar The candles on the cake.
     * @return The number of candles which can be blown.
     */
    public static int birthdayCakeCandles(int[] ar) {

    	int highestCandle = ar[0];
    	int candlesCount = 1;
    	
    	for(int i = 1; i < ar.length; i++) {
    		if(ar[i] == highestCandle) {
    			candlesCount++;
    		}else if(ar[i] > highestCandle) {
    			highestCandle = ar[i];
    			candlesCount = 1;
    		}
    	}
    	
    	return candlesCount;

    }
	
}
