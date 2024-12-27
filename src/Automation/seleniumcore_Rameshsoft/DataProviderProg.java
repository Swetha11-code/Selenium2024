package Automation.seleniumcore_Rameshsoft;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProg {

	@Test(dataProvider ="IfYouWantJobDataProv" )
	public void IfYouWantJob(String practHrs,String res) {
System.out.println(practHrs+" = "+res);
}
	@DataProvider
public Object[][] IfYouWantJobDataProv()	
{
	Object[][] obj = new Object[4][2];
	obj[0][0] = "9";
	obj[0][1] = "JOB";
	obj[1][0] = "15";		
	obj[1][1] = "JOBS";	
	obj[2][0] = "5";
	obj[2][1] = "PRACTICE";
	obj[3][0] = "6";		
	obj[3][1] = "SUBJECT";		
		return obj;
}
	
	
	
	
	
}
