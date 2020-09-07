package problem_solving;

/**
 * Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse.
 * For instance, given the number 12, its reverse is 21. Their difference is 9. The number 120 reversed is 21, and their difference is 99.
 *
 * She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.
 *
 * Given a range of numbered days, [i..j] and a number k, determine the number of days in the range that are beautiful.
 * Beautiful numbers are defined as numbers where |i - reverse(i)| is evenly divisible by k.
 * If a day's value is a beautiful number, it is a beautiful day.
 */
public class BeautifulDaysAtTheMovies {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private BeautifulDaysAtTheMovies() {}

	/**
	 * Counts the number of beautiful days in an interval.
	 *
	 * @param i The starting day.
	 * @param j The ending day.
	 * @param k The divisor.
	 * @return The number of beautiful days within the interval.
	 */
    public static int countBeautifulDays(int i, int j, int k) {
    	int beautifulDays = 0;

    	for(int day = i; day <= j; day++) {
    		if(isBeautiful(day, k)) {
    			beautifulDays++;
    		}
    	}

    	return beautifulDays;
    }

    /**
     * Checks if a day's value is beautiful.
     *
     * @param day The day value.
     * @return true, if the day value is beautiful, false otherwise.
     */
    private static boolean isBeautiful(int day, int k) {
    	return (day - reverseNumber(day)) % k == 0;
    }

    /**
     * Reverses a number.
     *
     * @param number The number to be reversed.
     * @return The reverse of the number.
     */
    private static int reverseNumber(int number) {
    	char[] digits = Integer.valueOf(number).toString().toCharArray();
    	StringBuffer buffer = new StringBuffer();
    	for(int i = digits.length - 1; i >= 0; i--) {
    		buffer.append(digits[i]);
    	}

    	return Integer.valueOf(buffer.toString());
    }
}
