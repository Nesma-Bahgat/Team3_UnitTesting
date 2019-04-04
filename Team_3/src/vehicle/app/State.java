package vehicle.app;

import vehicle.hal.Temp;

public class State {
	
	public static int validateCall=0;
	
	public void vidGoToNextState()
	{
		Global.iState=4;
		validateCall++;
		Global.validateSeq1=1;
		Global.validateSeq2=0;
	}
	
	public boolean bValidateLowPerformance() 
	{
		boolean ret =false;
		if( (Temp.iRreadT1() < 60 ) && (Temp.iRreadT2() > 50 )  )
		{
			ret= true;
		}
		else
		{
			ret= false;
		}
		return ret;
	}

}
