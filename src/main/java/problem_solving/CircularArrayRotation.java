package problem_solving;

/**
 * John Watson knows of an operation called a right circular rotation on an array of integers.
 * One rotation operation moves the last array element to the first position and shifts all remaining elements right one.
 * To test Sherlock's abilities, Watson provides Sherlock with an array of integers.
 * Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.
 *
 * For each array, perform a number of right circular rotations and return the value of the element at a given index.
 */
public class CircularArrayRotation {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private CircularArrayRotation() {}

	/**
	 * Rotates an array a given number of times and return the desired indexes.
	 *
	 * @param a An array of integers to rotate.
	 * @param k The rotation count
	 * @param queries The indices to report.
	 * @return The value of the given indexes after the array has been rotated.
	 */
    public static int[] getArrayValues(int[] a, int k, int[] queries) {
    	final int[] values = new int[queries.length];
    	int[] rotatedArray = a;

    	final int rotations = k % a.length;
    	for(int i = 1; i <= rotations; i++) {
    		rotatedArray = rotateArray(rotatedArray);
    	}

    	for(int i = 0; i < queries.length; i++) {
    		values[i] = rotatedArray[queries[i]];
    	}

    	return values;
    }

    /**
     * Rotates an array.
     *
     * @param array The array to be rotated.
     * @return The rotated array.
     */
    private static int[] rotateArray(int[] array) {
    	final int[] rotatedArray = new int[array.length];

    	final int lastElement = array[array.length - 1];
    	for(int i = 0; i < array.length - 1; i++) {
    		rotatedArray[i+1] = array[i];
    	}

    	rotatedArray[0] = lastElement;
    	return rotatedArray;
    }

}
