package sdet_selenium;
/*
1) Launch browser(Chrome)
2) Open URL https://www.opencart.com/
3) Validate title should be "Your store"	
4) Close browser

*/



import org.openqa.selenium.chrome.ChromeDriver;

public class day27_FirstTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\OneDrive\\Desktop\\rameshsoft\\Driver\\chromedriver.exe");
		//1) Launch browser
		ChromeDriver driver=new ChromeDriver();
		//2) Open URL
		driver.get("https://www.opencart.com/");
		
		//3) Validate title 
		//OpenCart - Open Source Shopping Cart Solution
		String act_title=driver.getTitle();
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	
		//4) close browser
		driver.close();
	
	}
	
	

}
