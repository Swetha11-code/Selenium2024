package selenium_Rameshsoft;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\vinod\\OneDrive\\Desktop\\rameshsoft\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage(). window(). maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com");
		
		driver.findElement(By.linkText("Autocomplete")).click();
		
		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames are=" +frames.size());
		
		//driver.switchTo().frame(0);
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		
			driver.findElement(By.id("tags")).sendKeys("java");
			driver.switchTo()	.defaultContent();
			driver.findElement(By.linkText("Draggable")).click();
		
			//driver.switchTo().frame(0);
	TargetLocator targetLocator = driver.switchTo();
	targetLocator.frame(0);
	
			WebElement draggable = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(draggable, 150, 150).build().perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		
		WebElement draggable1 driver.findElement(By.id("draggable"));
		WebElement droppable1 driver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(draggable1, droppable1).build().perform();
		
				
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}
