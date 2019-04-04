package vehicle.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import vehicle.test.App2Test;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result=new JUnitCore().run(App2Test.class);
		System.out.println("Running Test Cases: "+result.getRunCount());
		for(Failure fail: result.getFailures())
		{
			System.out.println("Failed test : " + fail.getTestHeader());
			System.out.println("The message : " + fail.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}

}
