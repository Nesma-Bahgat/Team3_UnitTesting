package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import vehicle.app.State;
import vehicle.hal.*;

public class MainTest {
	
	State object = new State();


	
	@Test
	public void Atc2validateHighPerformance() { //Test temperature = 50
		Temp.validateCallReadT1=0;
		Temp.variableofTest=1;
		assertAll(
				() ->assertTrue(object.validateHighPerformance()),
		
				() ->assertEquals(1, Temp.validateCallReadT1),
		 
				() ->	assertTrue(Temp.iReadT1()<=50)
				);
 				

	}
	
	@Test
	public void Btc3validateHighPerformance() { //Test temperature > 50
		Temp.validateCallReadT1=0;
		Temp.variableofTest=3;
		assertAll(
		() -> assertFalse(object.validateHighPerformance()),
		() ->	assertEquals(1, Temp.validateCallReadT1),
		
		() ->assertTrue(Temp.iReadT1()>50)
		);
		
	}
	
	
	}
