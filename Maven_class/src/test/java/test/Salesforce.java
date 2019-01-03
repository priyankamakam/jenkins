package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Salesforce {
	 private WebDriver driver;
		@Test				
	public void testEasy() throws InterruptedException {	
			 driver.get("https://login.salesforce.com/");
			 WebElement username = driver.findElement(By.id("username"));
			 WebElement password = driver.findElement(By.id("password"));
			 WebElement loginbtn = driver.findElement(By.id("Login"));

			 username.sendKeys("priyankamakam.bhupal@gmail.com");
			 password.sendKeys("Priyanka@32");
			 loginbtn.click();
			 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			/*WebElement NoThanks = driver.findElement(By.id("lexNoThanks"));
			 NoThanks.click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 WebElement sendtoSalesforce = driver.findElement(By.id("lexSubmit"));
			 sendtoSalesforce.click();*/
			 Thread.sleep(10000);
		String title = driver.getTitle();	
		System.out.println(title);
	AssertJUnit.assertTrue(title.contains("Recently Viewed | Cases | Salesforce")); 	
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
