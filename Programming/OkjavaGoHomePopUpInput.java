import org.opentutorials.iot.Security;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import javax.swing.JOptionPane;

public class OkjavaGoHomePopUpInput {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter your home ID(Address)");
		String roomID = id;
	
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
