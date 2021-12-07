package launchBrowser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestUsingJUnit {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\Desktop\\jan2021-selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//go to website
		driver.get("https://techfios.com/billing/?ng=admin/");
		//maximize the window
		driver.manage().window().maximize();
		//delete the cookies
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void loginTest() throws InterruptedException {
		//identify username field and pass the value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identify password field and pass the value
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identify signin button and click
		driver.findElement(By.name("login")).click();
		//stop execution for certain time
		Thread.sleep(3000);
	}
	@Test
	public void invalidLoginTest() throws InterruptedException {
		//identify username field and pass the value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identify password field and pass the value
		driver.findElement(By.id("password")).sendKeys("abc12");
		//identify signin button and click
		driver.findElement(By.name("login")).click();
		//stop execution for certain time
		Thread.sleep(3000);
		}
	@Test
	public void invalidLoginTest1() throws InterruptedException {
		//identify username field and pass the value
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		//identify password field and pass the value
		driver.findElement(By.id("password")).sendKeys("abc12");
		//identify signin button and click
		driver.findElement(By.name("login")).click();
		//stop execution for certain time
		Thread.sleep(3000);
		}
	@After
	public void tearDown() {
		//close the browser
		driver.close();
	}
	
}


