package com.rameshsoft.automation.testngprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgProgNew {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.out.println("BeforeSuite");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinod\\OneDrive\\Desktop\\rameshsoft_sdet\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
				driver.manage().deleteAllCookies();

				}
	@BeforeTest
	public void beforeTest() {
System.out.println("Before Test");		
	}
@AfterTest
	public void afterTest() {
System.out.println("After Test");
	}

@BeforeClass
public void beforeClass() {
System.out.println("Before Class");		
}
@AfterClass
public void afterClass() {
System.out.println("After Class");
}
	
@Test
	public void gmailTest() throws InterruptedException {
		System.out.println("@Test");
		driver.get("https://www.gmail.com");
		WebElement un = driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("swetha.qa2024");
		WebElement nxt = driver.findElement(By.id("identifierNext"));
		nxt.click();
		Thread.sleep(5000);

	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("AfterSuite");
		driver.close();	
	}
	@BeforeMethod
	public void beforeMethod() {
System.out.println("Before Method");		
	}
@AfterMethod
	public void afterMethod() {
System.out.println("After Method");
	}
/*public static void main(String[] args) throws InterruptedException {
	
	TestNgProgNew prog = new TestNgProgNew();
	prog.openBrowser();
	prog.gmailTest();
	prog.closeBrowser();
	
	
}*/
	
@Test(invocationCount=5,invocationTimeOut=5000)
public void job() throws InterruptedException {
	System.out.println("job() : @Test");
	}
@Test(alwaysRun=true,dependsOnMethods="job")
public void practice() throws InterruptedException {
	System.out.println("practice() : @Test");
	}
	
}
