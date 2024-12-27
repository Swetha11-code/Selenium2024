package selenium_Rameshsoft;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowserProg {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver" , "C:\\\\Users\\\\vinod\\\\OneDrive\\\\Desktop\\\\RAMESHSOFT & SDET\\\\Drivers\\\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
        //RemoteWebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
      //  SearchContext driver =   new ChromeDriver();


         driver.manage(). window(). maximize();
		//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
		
		Options options=driver.manage();
		Timeouts timeouts=options.timeouts();
		timeouts.implicitlyWait(2, TimeUnit.MINUTES);// CROSSCHECK LATER NOT EXECUTING
		
		driver.get("https://www.gmail.com");
		
		
		WebDriverWait wait = new WebDriverWait();
WebElement un=driver.findElement(By.id("identifierId"));
un.clear();
un.sendKeys("swetha.qa2024");

       Thread.sleep(5000);
       


WebElement nxt=driver.findElement(By.id("identifierNext"));
nxt.click();

		String curUrl =  driver.getCurrentUrl();
		System.out.println("Current URL is : "+curUrl);
		 
		String actTitle = driver.getTitle();
		System.out.println("Title is : "+actTitle);
		
		String CurWinName = driver.getWindowHandle();
		System.out.println("Current Window Name is = "+CurWinName);
		
		Set<String>  windows = driver.getWindowHandles();
		System.out.println("windows");
		
		
		
		driver.close();
	}

}
 