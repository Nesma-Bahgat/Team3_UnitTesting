package vehicle.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import vehicle.app.State;
import vehicle.hal.Temp;

public class App5Test {

	State state = new State();

	/**_____________True && True____________________*/
	@Test
	public void testbValidateLowPerformanceTrueTrue() 
	{
		Temp.variableofTest=1;
	    Temp.validateCallReadT1=0;
	    Temp.validateCallReadT2=0;
		assertAll(
				  () -> assertTrue(state.bValidateLowPerformance()) ,
				  () -> assertEquals(1,Temp.validateCallReadT1),
				  () -> assertEquals(1,Temp.validateCallReadT2),
				  () -> assertTrue(Temp.iReadT1()<60),
				  () -> assertTrue(Temp.iReadT2()>50)
				  
				);
		
	}
	
	@Test
	/**________________True && False_________________*/
	public void testbValidateLowPerformanceTrueFalse() 
	{
		Temp.variableofTest=2;
	    Temp.validateCallReadT1=0;
	    Temp.validateCallReadT2=0;
		assertAll(
			  () -> assertFalse(state.bValidateLowPerformance()) ,
			  () -> assertEquals(1,Temp.validateCallReadT1),
			  () -> assertEquals(1,Temp.validateCallReadT2),
			  ()-> assertTrue(Temp.iReadT1()<60),
			  ()-> assertFalse(Temp.iReadT2()>50)
	  	);
		
	}
	
	@Test
	/**________________False && True_________________*/
	public void testbValidateLowPerformanceFalseTrue() 
	{
		Temp.variableofTest=3;
	    Temp.validateCallReadT1=0;
	    Temp.validateCallReadT2=0;
		assertAll(
			  () -> assertFalse(state.bValidateLowPerformance()) ,
			  () -> assertEquals(1,Temp.validateCallReadT1),
			  ()-> assertFalse(Temp.iReadT1()<60)
	
			  // because if False && True its not matter to check the second condition
			  // () -> assertEquals(1,Temp.ValidateCallReadT2)
	  	);
		
	}
	
}
