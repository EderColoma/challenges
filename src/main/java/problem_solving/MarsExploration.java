package problem_solving;

/**
 * Sami's spaceship crashed on Mars! She sends a series of SOS messages to Earth for help.
 * Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, s, determine how many letters of Sami's SOS have been changed by radiation.
 * For example, Earth receives SOSTOT. Sami's original message was SOSSOS. Two of the message characters were changed in transit.
 */
public class MarsExploration {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private MarsExploration() {}
	
	/**
	 * Counts how many letters were changed from the original message.
	 * 
	 * @param message The message received.
	 * @return How many letters were changed from the original message.
	 */
	public static int countChangedCharacters(String message) {
		int changedCharacters = 0;
		
		for(int i = 0; i <= message.length() - 3; i += 3) {
			String part = message.substring(i, i + 3);
			if(!part.equals("SOS")) {
				changedCharacters += part.substring(0, 1).equals("S") ? 0 : 1;
				changedCharacters += part.substring(1, 2).equals("O") ? 0 : 1;
				changedCharacters += part.substring(2, 3).equals("S") ? 0 : 1;
			}
		}
		
		return changedCharacters;
	}

}