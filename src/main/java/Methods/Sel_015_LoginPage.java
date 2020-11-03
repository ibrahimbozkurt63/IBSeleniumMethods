package Methods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_015_LoginPage {
	
	public static WebDriver driver;
	
	static By email = By.id("username");
	static By password = By.xpath("//input[@id='password']");
	static By loginBtn = By.cssSelector("#loginBtn");
	
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = ElementUtils.launchBrowser(driver, "chrome");
		ElementUtils.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		ElementUtils.getElement(driver, email).sendKeys("jackson@sample.com");
		ElementUtils.getElement(driver, password).sendKeys("test7984yr398");
		ElementUtils.clickOn(driver, loginBtn);
		ElementUtils.quitBrowser(driver);
		
	}

}
