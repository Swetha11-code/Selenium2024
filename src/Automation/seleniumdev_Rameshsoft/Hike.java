package Automation.seleniumdev_Rameshsoft;

import org.testng.annotations.Test;

public class Hike {
	
	@Test(groups= {"rt", "st","e2e"})
	public void hike1() {
System.out.println("hike1");
}

@Test(groups = {"rt", "st","e2e"})
public void hike2() {
System.out.println("hike2");
}

@Test(groups= {"rt"} )
public void hike3() {
System.out.println("hike3");
}

@Test(groups= {"e2e"} )
public void hike4() {
System.out.println("hike4");
}

}
