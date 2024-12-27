
//Write a program for no.of enabled links and disabled links in adp.com


package collectionframework_Rameshsoft;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam_Prog3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinod\\OneDrive\\Desktop\\RAMESHSOFT & SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
				driver.manage().deleteAllCookies();
				driver.get("https://www.adp.com");

				int enabledLinks =0;
				int disabledLinks =0;
				
		// get total no.of elements from adp.com
				List<WebElement> elements = driver.findElements(By.xpath("//*"));
				System.out.println("no.of elements in adp.com page is: "+elements.size());
			
				Iterator<WebElement> itr = elements.iterator();
				while (itr.hasNext())
				{
					WebElement webElement = itr.next();
					if(webElement.isDisplayed()&&webElement.isEnabled()) {
						enabledLinks++;
					}
					else
					{
						disabledLinks++;
					}		
				}
				
				System.out.println("Enabled links are = "+enabledLinks);
				System.out.println("Disabled links are = "+disabledLinks);
				
				
	Thread.sleep(5000);
	driver.close();
		
		
		
		
		
		
		
	}

}
