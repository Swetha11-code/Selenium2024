package collectionframework_Rameshsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_Prog2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinod\\OneDrive\\Desktop\\RAMESHSOFT & SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
				
				driver.manage().deleteAllCookies();
				driver.get("https://www.rameshsoft.com");
				driver.findElement(By.xpath("//a[text()='Videos']")).click();
				
				
				String currentWindowName=driver.getWindowHandle();
				System.out.println(currentWindowName); //rameshsoft.com
				
				Set<String> windows = driver.getWindowHandles();
				System.out.println(windows);// [rameshsoft.com,youtube.com]
				
				List<String> list = new ArrayList<String>(windows);
				String winName = list.get(1);
				
				driver.switchTo().window(winName);
				driver.findElement(By.xpath("//div[@id='search-input']/input")).sendKeys("rameshsoft java");
				
				Thread.sleep(5000);
				
			//driver.close();
			driver.quit();	
				
	}

}
