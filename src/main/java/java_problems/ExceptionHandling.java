package java_problems;

/**
 * You are required to compute the power of a number by implementing a calculator.
 * Create a class which consists of a single method long power(int, int).
 * This method takes two integers, n and p. If either n or p is negative, then the method must throw an exception which says "n or p should not be negative".
 * Also, if both n and p are zero, then the method must throw an exception which says "n and p should not be zero".
*/
public class ExceptionHandling {

	/**
	 * Computes the power of a number.
	 * @param n Base
	 * @param p Exponent
	 * @return n to the p power.
	 * @throws Exception
	 */
	public long power(int n, int p) throws Exception {

		if(n < 0 || p < 0) {
			throw new Exception("n or p should not be negative");
		}

		if(n == 0 && p == 0) {
			throw new Exception("n and p should not be zero");
		}

		return (long) Math.pow(n, p);
	}

}