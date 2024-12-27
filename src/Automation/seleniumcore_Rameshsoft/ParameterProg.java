package Automation.seleniumcore_Rameshsoft;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterProg {

	@Parameters({"res","practHrs"})
	@Test(invocationCount=5)
	public void hardwork(@Optional("PRACTICE")String res,@Optional("8hrs")String practHrs) {
	System.out.println("Hardwork = "+res+" = "+practHrs);
	
	
}

}
