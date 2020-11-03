package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_030_ExplicitlyWait_1 {

	public static void main(String[] args) {
		
		//It works with web element and non web-element
		//webdriverwait class
		
		//5 locators 4 locators can be availabel 5 - can be available 10
		//fluent 4 locators available 5 seconds can be available 10- 15- 20 - 30 == fluent 30 polling 2
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		//non-web element
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot")); //org.openqa.selenium.TimeoutException
		
		//Web element
		By email = By.id("username");
		
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		WebElement username = driver.findElement(email);
		username.sendKeys("ilhan@newjersey.com");
		
		System.out.println(driver.getTitle());

	}

}
