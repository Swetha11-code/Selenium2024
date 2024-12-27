package Automation.seleniumcore_Rameshsoft;

import org.testng.annotations.Test;

public class Job1 {
	@Test(groups= {"rt", "e2e"})
	public void job1() {
System.out.println("job1");
	}
	
	@Test(groups= { "st","e2e"})
	public void job2() {
System.out.println("job2");
	}
	
}
