package selenium_Rameshsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\OneDrive\\Desktop\\rameshsoft_sdet\\Driver\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.gmail.com");
	
	//<input type="email" class="whsOnd zHQkBf" aria-label="Email or phone"  name="identifier"  value=""   id="identifierId">
	
	//WebElement un = driver.findElement(By.id("identifierId"));
	WebElement un = driver.findElement(By.ById.id("identifierId"));
	
	un.clear();
	un.sendKeys("swetha.qa2024@gmail.com");
	
	Thread.sleep(5000);
	
WebElement nxt = driver.findElement(By.id("identifierNext"));
	//WebElement nxt = driver.findElement(By.ById.id("identifierNext"));
	
	nxt.click();

Thread.sleep(5000);

driver.close();

	}

	

}
