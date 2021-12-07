package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		invalidLoginTest();
		tearDown();
	
		
	}
	
	public static void launchBrowser() {
		//user.dir
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\Desktop\\jan2021-selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//go to website
		driver.get("https://techfios.com/billing/?ng=admin/");
		//maximize the window
		driver.manage().window().maximize();
		//delete the cookies
		driver.manage().deleteAllCookies();
		
	}
	
	public static void loginTest() throws InterruptedException {
		//identify username field and pass the value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identify password field and pass the value
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identify signin button and click
		driver.findElement(By.name("login")).click();
		//stop execution for certain time
		Thread.sleep(3000);
	}
	
	public static void invalidLoginTest() throws InterruptedException {
		//identify username field and pass the value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identify password field and pass the value
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identify signin button and click
		driver.findElement(By.name("login")).click();
		//stop execution for certain time
		Thread.sleep(3000);
		}
	
	public static void tearDown() {
		//close the browser
		driver.close();
	}
	
}
