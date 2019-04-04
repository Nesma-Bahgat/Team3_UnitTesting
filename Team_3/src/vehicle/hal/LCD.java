package vehicle.hal;

import vehicle.app.Global;

public class LCD {
	
	public static int validateCall;
	public static int LCDState;
	public static void vidOutput(int state)
	{
		validateCall++;
		Global.validateSeq1=2;
		Global.validateSeq2=0;
        LCDState=state;
	}

}
