package problem_solving;

import java.math.BigInteger;

public class TwoTwo {

	private TwoTwo() {}
	
	static int twoTwo(String value) {

		int powersOfTwo = 0;
		
		for(int i = 0; i < value.length(); i++) {
			for(int j = i + 1; j <= value.length(); j++) {
				String strNumber = value.substring(i, j);
				if(!strNumber.startsWith("0")) {
					BigInteger number = new BigInteger(strNumber);
					if(isPowerOfTwo(number)) {
						powersOfTwo++;
					}
				}
			}
		}
		
		return powersOfTwo;
		
    } 
	
	private static boolean isPowerOfTwo(BigInteger number) {
		BigInteger zero = BigInteger.valueOf(0);
		boolean isNotZero = number.compareTo(zero) != 0;
		boolean isNotOne = !number.equals(BigInteger.valueOf(1));
		
		BigInteger minusOne = number.subtract(BigInteger.valueOf(1));
		boolean minusOneEqualsZero = number.and(minusOne).equals(zero);
		return isNotZero && minusOneEqualsZero && isNotOne;
	}
}
