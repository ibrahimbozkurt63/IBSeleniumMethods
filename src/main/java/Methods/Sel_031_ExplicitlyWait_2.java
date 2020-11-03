package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_031_ExplicitlyWait_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		//non-web element
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		getElement(driver, email).sendKeys("onur@sample.com");
		getElement(driver, password).sendKeys("sinan123");
		getElement(driver, loginBtn).click();
		
		System.out.println("test done...");
		
        //driver.close();
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
	}

}
