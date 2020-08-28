package problem_solving;

/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. 
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 */
public class TimeConversion {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private TimeConversion() {}
	
	/**
	 * Converts a 12-hour AM/PM format date to military (24-hour).
	 * @param date The date to be converted.
	 * @return The date converted to military (24-hour) format.
	 */
	public static String convert(String date) {
		String period = date.substring(date.length() - 2, date.length());
		String strHour = date.substring(0, 2);
		
		if(period.equals("AM")) {
			if(strHour.equals("12")) {
				return "00" + date.substring(2, date.length() - 2);
			}
			else {
				return date.substring(0, date.length() - 2);
			}
		}else {
			if(strHour.equals("12")) {
				return date.substring(0, date.length() - 2);
			}else {
				Integer hour = Integer.valueOf(strHour) + 12;
				StringBuilder convertedDate = new StringBuilder();
				convertedDate.append(hour.toString().length() == 1 ? "0" + hour : hour.toString());
				convertedDate.append(date.substring(2, date.length() - 2));
				
				return convertedDate.toString();
			}
		}
	}
	
}
