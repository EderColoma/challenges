package problem_solving;

/**
 * A jail has a number of prisoners and a number of treats to pass out to them.
 * Their jailer decides the fairest way to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs.
 * A chair number will be drawn from a hat. Beginning with the prisoner in that chair, one candy will be handed to each prisoner sequentially
 * around the table until all have been distributed.
 *
 * The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful.
 * Determine the chair number occupied by the prisoner who will receive that candy.
 *
 * For example, there are 4 prisoners and 6 pieces of candy.
 * The prisoners arrange themselves in seats numbered 1 to 4. Let's suppose two is drawn from the hat.
 * Prisoners receive candy at positions 2, 3, 4, 1, 2, 3. The prisoner to be warned sits in chair number 3.
 */
public class SaveThePrisoner {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private SaveThePrisoner() {}

	/**
	 * Determines the chair number occupied by the prisoner who will receive the awful candy.
	 *
	 * @param prisoners The number of prisoners.
	 * @param candies The number of sweets.
	 * @param seat The chair number to begin passing out sweets from.
	 * @return The chair number occupied by the prisoner who will receive the awful candy.
	 */
	static int findUnluckyPrisoner(int prisoners, int candies, int seat) {

		if(candies <= 0) {
			return 0;
		}

		return ((seat - 1 + candies - 1) % prisoners) + 1;

    }
}
