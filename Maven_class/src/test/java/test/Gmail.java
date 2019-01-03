package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail {
	 private WebDriver driver;
		@Test				
	public void testEasy() throws InterruptedException {	
		driver.get("https://gmail.com");  
		driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("priyankamakam.bhupal");
		driver.findElement(By.xpath(".//div[@id='identifierNext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("priyanka@32");
		driver.findElement(By.xpath(".//div[@id='passwordNext']")).click();
		Thread.sleep(2000);
		 String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("Inbox - priyankamakam.bhupal@gmail.com - Gmail")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver", "C:/Users/rajesh/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		//driver.quit();			
	}	
}
