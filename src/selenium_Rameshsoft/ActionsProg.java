package selenium_Rameshsoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsProg
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinod\\OneDrive\\Desktop\\rameshsoft\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		
//APPROACHES OR WAYS TO ENTER URL:
//-------------------------------------------------------------		
		//driver.get("https://www.gmail.com");
		//driver.navigate().to("https://www.gmail.com");
		//URL url= new URL("https://www.gmail.com");
		//driver.navigate().to(url);
		
		//Navigation navigation = driver.navigate();
		//navigation.to("https://www.gmail.com");
		
		//Using JavascriptExecutor
		
//WAYS TO PERFORM DATATYPING ACTIONS
//-----------------------------------------------------------		
		
//	WebElement un=driver.findElement(By.id("identifierId"));
	//un.clear();
	//un.sendKeys("swetha.qa2024@gmail.com");
		
	//	Actions actions= new Actions(driver);
		//actions.sendKeys("swetha.qa2024@gmail.com").build().perform();
		//actions.sendKeys("swetha.qa2024@gmail.com").perform();
		
		//actions.click(un).sendKeys("swetha.hnc@gmail.com").build().perform();// this line can also written as following lines
		/*Actions actions2 = actions.click(un);
		Actions actions3 = actions2.sendKeys("swetha.qa2024@gmail.com");
		Action action = action3.build();
		action.perform();
		*/
		
		actions.sendKeys(un, "swetha.hnc@gmail.com").build().perform();
		
		//Using JavascriptExecutor
		//Using Robot class also we can perform datatyping
		
//WAYS TO PERFORM CLICKABLE ACTIONS:-
//---------------------------------------------------------
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	//	nxt.click();
	//actions.click(nxt).build().perform();
	//actions.doubleClick(nxt).build().perform();
	//	actions.sendKeys(nxt, Keys.ENTER).build().perform();
		//Using JavascriptExecutor
		//Using Robot class also we can perform clickable action
	actions.sendKeys(Keys.END).build().perform();
	actions.sendKeys(Keys.HOME).build().perform();
	
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
	actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
	actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_LEFT).build().perform();
	
	//HOW CAN WE PERFORM ctrl + a ctrl + t ctrl + s ctrl + d
	//ctrl + shift + a....
	actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform(); // using chord method we can perform ctrl + shift + operations
	actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
	
	// HOW TO PERFORM MOUSE HOVER ACTIONS:-
//--------------------------------------------------------------------

	
	
		//Thread.sleep(5000);
	driver.get("https://www.amazon.in/");	
	driver.findElement(By.xpath("//div[text()='EN']"));
	actions.moveToElement(eng).build().perform();
	
	
	
	
	
	driver.close();
	}

}
