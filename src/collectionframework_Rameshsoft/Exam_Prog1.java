package collectionframework_Rameshsoft;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam_Prog1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinod\\OneDrive\\Desktop\\RAMESHSOFT & SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
				driver.manage().deleteAllCookies();
				driver.get("https://www.adp.com");

				int ddCount=0;
				
		// get total no.of elements from adp.com
				List<WebElement> elements = driver.findElements(By.xpath("//*"));
				System.out.println("no.of elements in adp.com page is: "+elements.size());
				for(WebElement  webElement : elements)
				{
					String tagName = webElement.getTagName();
					if(tagName.equalsIgnoreCase("select")) {
						ddCount++;
					}
				}
		System.out.println("no.of drop downs are: "+ddCount );
		
	
	Thread.sleep(5000);
	driver.close();
		
		
		
		
		
		
		
	}

}
