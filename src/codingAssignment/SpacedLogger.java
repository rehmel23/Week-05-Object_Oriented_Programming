package codingAssignment;

public class SpacedLogger implements Logger {

	@Override
	// Inherited from Logger. Utilizes "addSpaces" method and prints to the console.
	public void Log(String str) {
		System.out.println(addSpaces(str));
	}

	@Override
	/*
	 * Inherited from Logger. Prints the provided string to the console along with
	 * "ERROR:" at the beginning.
	 */
	public void Error(String str) {
		System.out.println("ERROR: " + addSpaces(str));
	}

	/*
	 * addSpaces takes a String as an argument and returns a String with the same
	 * String as the argument, but with spaces between each letter. For loop creates
	 * new String from argument with spaces between each letter. newStr.trim()
	 * returns String from the for loop with the extra space removed from the end.
	 */
	public String addSpaces(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr += str.charAt(i) + " ";
		}
		return newStr.trim();
	}

}
