package problem_solving;

/**
 * Given the time in numerals we may convert it into words.
 */
public class TimeInWords {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private TimeInWords() {}
	
	/**
	 * Transforms a time into words.
	 * 
	 * @param h The hour.
	 * @param m The minutes.
	 * @return The text representing the given time.
	 */
	public static String timeInWords(final int h, final int m) {

		if(m == 0) {
			return  numberInWords(h) + " " + minuteInWord(m);
		} else if (m > 30) {
			return minuteInWord(60 - m) + " to " + numberInWords(h + 1);
		} else {
			return minuteInWord(m) + " past " + numberInWords(h);
		}

    }

	/**
	 * Return the minute in words.
	 * 
	 * @param minute The minute to be returned in words.
	 * @return The given minute in words.
	 */
	private static String minuteInWord(final int minute) {
		if( minute == 0 ) {
			return "o' clock";
		}else if(minute == 15 || minute == 30) {
			return numberInWords(minute);
		} else {
			return numberInWords(minute) + (minute > 1 ? " minutes" : " minute");
		}
	}
	
	/**
	 * Return the number in words.
	 * 
	 * @param minute The number to be returned in words.
	 * @return The given number in words.
	 */
	private static  String numberInWords(final int number) {
		
		switch(number) {
		case 0:
			return "o' clock";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "quarter";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		case 20:
			return "twenty";
		case 21:
			return "twenty one";
		case 22:
			return "twenty two";
		case 23:
			return "twenty three";
		case 24:
			return "twenty four";
		case 25:
			return "twenty five";
		case 26:
			return "twenty six";
		case 27:
			return "twenty seven";
		case 28:
			return "twenty eight";
		case 29:
			return "twenty nine";
		case 30:
			return "half";
		default:
			return "unknown";
		}
	}
	
}
