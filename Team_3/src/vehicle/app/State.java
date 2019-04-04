package vehicle.app;

public class State {
	
	public static int validateCall=0;
	
	public void vidGoToNextState()
	{
		Global.iState=4;
		validateCall++;
		Global.validateSeq1=1;
		Global.validateSeq2=0;
	}

}
