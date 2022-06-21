import org.opentutorials.iot.Security;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import java.util.Scanner;  // Import the Scanner class

public class OkjavaGoHomeConsoleInput {

	public static void main(String[] args) {
		
		Scanner IDObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter your home ID (Address)");
		
		String IDValue = IDObj.nextLine();  // Read user input
		String roomID = IDValue;
	
		// Elevator call
		Elevator myElevator = new Elevator(roomID);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(roomID);
		mySecurity.off();
		// Light on
		Lighting hallLamp = new Lighting(roomID + " / Hall Lamp");
		hallLamp.on();
		
		Lighting toiletLamp = new Lighting(roomID + " / Toilet Lamp");
		toiletLamp.on();

	}

}
