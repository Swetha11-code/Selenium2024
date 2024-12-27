package Automation.seleniumcore_Rameshsoft;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterProg1 {
	@Parameters({"res","practHrs"})
	@Test
	public void hardwork(@Optional("PRACTICE")String res,@Optional("8hrs")String practHrs) {
	System.out.println("Hardwork = "+res+" = "+practHrs);
	
	
}
}
