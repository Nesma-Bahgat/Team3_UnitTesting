package vehicle.hal;

import vehicle.app.Global;

public class Motor {
	
	public static int validateCall;
	public static int MotorState;
	public static void vidOutput(int state)
	{
		validateCall++;
		Global.validateSeq2=3;
		MotorState=state;
	}

}
