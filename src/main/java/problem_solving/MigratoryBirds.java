package problem_solving;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in will be identified by an integer value. 
 * Each time a particular kind of bird is spotted, its id number will be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings. 
 * Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.
 */
public class MigratoryBirds {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private MigratoryBirds() {}
	
	/**
	 * Checks which bird species is most sighted.
	 * 
	 * @param birdSights The list of bird sightings.
	 * @return The species most commonly sighted.
	 */
	public static int findMostCommon(List<Integer> birdSights){
		
		int mostCommon = 1;
		int mostCommonSights = 0;
		Map<Integer, Integer> sightsMap = countSights(birdSights);
		
		for(Map.Entry<Integer, Integer> entry : sightsMap.entrySet()) {
			if(entry.getValue() > mostCommonSights) {
				mostCommon = entry.getKey();
				mostCommonSights = entry.getValue();
			}
		}
		
		return mostCommon;
				
	}
	
	/**
	 * Counts the sightings of each bird species.
	 * 
	 * @param birdSights The list of bird sightings.
	 * @return A map containing the amount of sightings of each bird species.
	 */
	private static Map<Integer, Integer> countSights(List<Integer> birdSights){

		Map<Integer, Integer> sightsMap = new HashMap<>();
		
		birdSights.forEach(s -> {
			if(sightsMap.containsKey(s)) {
				sightsMap.put(s, sightsMap.get(s) + 1);
			}
			else {
				sightsMap.put(s, 1);
			}
		});
		
		return sightsMap;
	}

}
 