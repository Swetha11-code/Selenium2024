package selenium_Rameshsoft;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailTest 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\OneDrive\\Desktop\\rameshsoft_sdet\\Driver\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	//RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.gmail.com");
	
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	
	File img = takesScreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(img, new File("C:\\Users\\vinod\\OneDrive\\Desktop\\framework_rameshsoft\\Screenshots\\homepage1.jpeg"));
	
	//<input type="email"     class="whsOnd zHQkBf"   aria-label="Email or phone"    name="identifier"    value=""   id="identifierId">
	
	WebElement un = driver.findElement(By.id("identifierId"));
	un.clear();
	un.sendKeys("swetha.qa2024@gmail.com");
	
	//Thread.sleep(5000);

	
WebElement nxt = driver.findElement(By.id("identifierNext"));
nxt.click();


 File img1 = takesScreenshot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(img1, new File("C:\\Users\\vinod\\OneDrive\\Desktop\\framework_rameshsoft\\Screenshots\\username1.jpeg"));
Thread.sleep(5000);

driver.close();

	}

}
