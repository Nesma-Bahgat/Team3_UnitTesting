package vehicle.hal;

public class Temp 
{
	public static int validateCallReadT1=0;
	public static int validateCallReadT2=0;
	public static int returnOfReadT1;
	public static int returnOfReadT2;
	public static int variableofTest;
	public static String validateSeq="";

	public static int iReadT1()
	{
		validateCallReadT1++;
		validateSeq=validateSeq+"a";
		if(variableofTest==1) return 30;
		else if(variableofTest==2) return 30;
		else return 80;
	}
	
	public static int iReadT2()
	{
		validateCallReadT2++;
		validateSeq=validateSeq+"b";
		if(variableofTest==1) return 60;
		else if(variableofTest==2) return 40;
		else return 60;
	}

}
