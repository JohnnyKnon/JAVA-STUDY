import org.opentutorials.iot.Security;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;

public class OkjavaGoHome {

	public static void main(String[] args) {
		
		String roomID = "JAVA APT 503";
	
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
