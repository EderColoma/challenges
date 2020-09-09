package problem_solving;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * A modified Kaprekar number is a positive whole number with a special property. If you square it, then split the number into two integers and sum those integers, you have the same value you started with.
 * Consider a positive whole number n with d digits. We square n to arrive at a number that is either 2 * d digits long or (2 * d) - 1 digits long. 
 * Split the string representation of the square into two parts, l and r. The right hand part, r must be d digits long.
 * The left is the remaining substring. Convert those two substrings back to integers, add them and see if you get n.
 */
public class KaprekarNumbers {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private KaprekarNumbers() {}
	
	/**
	 * Checks which numbers in a given range are Kaprekar numbers.
	 * 
	 * @param rangeStart The start of the range.
	 * @param rangeEnd The end of the range.
	 */
    public static List<Integer> findKaprekarNumbers(int rangeStart, int rangeEnd) {
    	List<Integer> kaprekarNumbers = new ArrayList<>();
    	for(int i = rangeStart; i <= rangeEnd; i++) {
    		if(isKaprekarNumbers(i)) {
    			kaprekarNumbers.add(i);
    		}
    	}
    	
    	return kaprekarNumbers;
    }

    /**
	 * Checks whether a number is a Kaprekar number.
	 * 
	 * @param number The number to be checked.
	 * @return true, if the number is a Kaprekar number, false otherwise.
	 */
    private static boolean isKaprekarNumbers(Integer number) {
    	BigInteger squared = BigInteger.valueOf(number).multiply(BigInteger.valueOf(number));
    	String leftNumber = getLeftNumber(squared, number);
    	String rightNumber = getRightNumber(leftNumber, squared);
    	
    	return (Integer.valueOf(rightNumber) + Integer.valueOf(leftNumber)) == number;
    }

    /**
     * 
     * @param squared
     * @param number
     * @return
     */
    private static int getLeftNumberStartIndex(BigInteger squared, Integer number) {
    	return squared.toString().length() - number.toString().length();
    }
    
    private static String getLeftNumber(BigInteger squared, Integer number) {
    	int startIndex = getLeftNumberStartIndex(squared, number);
    	if(startIndex < 0) {
    		startIndex = 0;
    	}
    	return squared.toString().substring(startIndex, squared.toString().length());
    }
    
    private static String getRightNumber(String leftNumber, BigInteger squared) {
    	return squared.toString().replace(leftNumber, "").isEmpty() ? "0" : squared.toString().replace(leftNumber, "");
    }
}
