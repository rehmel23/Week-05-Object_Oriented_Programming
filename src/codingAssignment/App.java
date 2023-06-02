package codingAssignment;

public class App {

	public static void main(String[] args) {

		// Instantiate AsteriskLogger
		Logger starMessage = new AsteriskLogger();

		// Implement Log and Error methods in AsteriskLogger on input Strings
		starMessage.Log("Stars");
		starMessage.Error("Also Stars");

		// Instantiate SpacedLogger
		Logger spaceMessage = new SpacedLogger();

		// Implement Log and Error methods in SpacedLogger on input Strings
		spaceMessage.Log("Space");
		spaceMessage.Error("Also Space");

	}

}
