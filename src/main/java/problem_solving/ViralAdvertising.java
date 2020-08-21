package problem_solving;

/**
 * HackerLand Enterprise is adopting a new viral advertising strategy. 
 * When they launch a new product, they advertise it to exactly 5 people on social media.
 * On the first day, half of those people like the advertisement and each shares it with 3 of their friends. 
 * At the beginning of the second day, 6 people receive the advertisement.
 * Each day, half of the recipients like the advertisement and will share it with 3 friends on the following day. 
 * Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day 1.
 */
public class ViralAdvertising {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private ViralAdvertising() {}
	
	/**
	 * Calculates how many people have liked the ad by the end of a given day.
	 * @param n The number of days.
	 * @return The amount of  people have liked the ad by the end of a given day.
	 */
	public static int calculateLikes(int n) {
		int likes = 0;
		int receivers = 5;
		
		for(int i = 1; i <= n; i++) {
			likes += Math.floorDiv(receivers, 2);
			receivers = Math.floorDiv(receivers, 2) * 3;
		}
		
		return likes;
	}

}
