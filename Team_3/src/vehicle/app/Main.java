package vehicle.app;

import vehicle.hal.LCD;
import vehicle.hal.Motor;

public class Main {

	
	public static void vidMain()
	{
		State state = new State();
		state.vidGoToNextState();
		Motor.vidOutput(Global.iState);
		LCD.vidOutput(Global.iState);
		
	}
}
