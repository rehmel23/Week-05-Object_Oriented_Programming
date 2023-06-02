package codingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	// Inherited from Logger. Implements "stars" method to print message.
	public void Log(String str) {
		System.out.println(stars(str));

	}

	@Override
	/*
	 * Inherited from Logger. "errorMiddle" creates the message in the middle line
	 * of the message along with the "stars" method. "*".repeat is used to create
	 * the box around "errorMiddle". Repeats "*" until the number of "*" creates a
	 * line the same length as the "errorMiddle." This is done on the top and
	 * bottom.
	 */
	public void Error(String str) {
		String errorMiddle = stars("Error: " + str);
		System.out.println("*".repeat(errorMiddle.length()));
		System.out.println(errorMiddle);
		System.out.println("*".repeat(errorMiddle.length()));
	}

	// stars method adds "***" to the beginning and end of the provided string.
	// Returns string.
	public String stars(String str) {
		return "***" + str + "***";
	}

}
