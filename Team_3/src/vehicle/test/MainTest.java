package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vehicle.app.State;
import vehicle.hal.Temp;

class MainTest {
	
	State object = new State();


	
	@Test
	void Atc2validateHighPerformance() { //Test temperature = 50
		Temp.validateTempCall=0;
		assertAll(
				() ->assertTrue(object.validateHighPerformance()),
		
				() ->assertEquals(1, Temp.validateTempCall),
		 
				() ->	assertTrue(Temp.iReadT1()<=50)
				);
 				
		System.out.println(Temp.temperature);

	}
	
	@Test
	void Btc3validateHighPerformance() { //Test temperature > 50
		Temp.validateTempCall=0;
		assertAll(
		() -> assertFalse(object.validateHighPerformance()),
		() ->	assertEquals(1, Temp.validateTempCall),
		
		() ->assertTrue(Temp.iReadT1()>50)
		);
		System.out.println(Temp.temperature);
	}
	
	
	}
