import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import javax.swing.JOptionPane;

public class OkjavaGoHomePopUpInput {
// args는 parameter 즉 매개변수.
	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Enter your home ID(Address)");
//		String roomID = id;
//		
//		String Brightness = JOptionPane.showInputDialog("Enter Brightness");
////		Integer.parseInt를 통하여,String 값을, Int로 변경 후 반
//		double brightValue = Double.parseDouble(Brightness);
		
		String roomID = args[0]; //args[0] index로 부터 시작 하므로 1번째, [0]인자값인, JAVA APT 507 호출
		String bright = args[1]; // [1]인자값인, 25.1
	
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
		
		DimmingLights moodLamp = new DimmingLights(roomID +"moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}
