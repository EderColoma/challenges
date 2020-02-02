package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100
 * for three categories: problem clarity, originality, and difficulty.
 * We define the rating for Alice's challenge to be the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge to be the triplet
 * b = (b[0], b[1], b[2]).
 *
 * Your task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
 * If a[i] > b[i], then Alice is awarded 1 point.
 * If a[i] < b[i], then Bob is awarded 1 point.
 * If a[i] = b[i], then neither person receives a point.
 * 
 * Return an array of two integers denoting the respective comparison points earned by Alice and Bob.
 */
public class PointsComparator {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private PointsComparator() {}
	
	/**
	 * Compare the points of two participants.
	 * @param a The scores of the first participant.
	 * @param b The scores of the second participant.
	 * @return The score of each participant.
	 */
	public static List<Integer> comparePoints(List<Integer> a, List<Integer> b){
		List<Integer> result = new ArrayList<>();
		result.add(0);
		result.add(0);
		
		for(int i = 0; i < a.size(); i++) {
			int comparison = a.get(i).compareTo(b.get(i));
			if(comparison > 0) {
				result.set(0, result.get(0) + 1);
			}else if(comparison < 0) {
				result.set(1, result.get(1) + 1);
			}
		}
		
		return result;
	}
	
}
