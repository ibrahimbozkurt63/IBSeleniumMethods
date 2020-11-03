package Methods;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author ilhan 
 *
 */

public class ElementUtils {
	
	//common methods
	
	/**
	 * This method is used to handle Javascript alert
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
				
	}
	
	/**
	 * This method is used to launch browser
	 * @param driver
	 * @param browserName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/bobit/Documents/Drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not available "+ browserName);
		}
		return driver;
	}
	
	
	/**
	 * URL
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("an exception occured while launching url");
		}
	
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		waitForPresenceOfElement(driver, locator);
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void waitForPresenceOfElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator) {
		
		driver.findElement(locator).click();
	}
	
	/**
	 * 
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}
	
	/**
	 * 
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	

}
