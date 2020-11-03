package Methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_037_TestNG_1 {
	
	//before method
	//before test
	//test
	//after test
	//after method
	
	public static WebDriver driver;
	
	//Locators
	By email = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	}
	
	@Test(priority=1, description="get title method")
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2, description="invalid credentials for login page")
	public void invalidCredentialsFroLogin() {
		ElementUtils.getElement(driver, email).sendKeys("ilhan@siliconelabs.com");
		ElementUtils.getElement(driver, password).sendKeys("test12345");
		ElementUtils.clickOn(driver, loginButton);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
			

}
