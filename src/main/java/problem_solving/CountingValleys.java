package problem_solving;

import static  java.util.Arrays.asList;

import java.util.List;

/**
 * Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. 
 * During his last hike he took exactly N steps. For every step he took, he noted if it was an uphill, U, or a downhill, D step. 
 * Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude. We define the following terms:
 *  - A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
 *  - A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 * Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
 * For example, if Gary's path is S = [DDUUUUDD] , he first enters a valley 2 units deep. Then he climbs out an up onto a mountain 2 units high. 
 * Finally, he returns to sea level and ends his hike.
 */
public class CountingValleys {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private CountingValleys() {}
	
	/**
	 * Counts the number of valleys passed through.
	 * @param n The number of steos given.
	 * @param s The path.
	 * @return The number of valleys passed through.
	 */
	public static int countValleys(final int n, final String s) {

		int valleys = 0;
		final List<String> steps = asList(s.replace("D", "D;").replace("U", "U;").split(";"));
		
		int altitude = 0;
		int previousAltitude = 0;
		for(final String step : steps) {
			previousAltitude = altitude;
			if(step.equals("D")) {
				altitude--;
			}else if(step.equals("U")) {
				altitude++;
			}
			
			if(altitude == 0 && previousAltitude < 0) {
				valleys++;
			}
		}
		
		return valleys;

	}
	
}
