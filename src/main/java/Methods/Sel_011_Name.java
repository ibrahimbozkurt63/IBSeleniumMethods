package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_011_Name {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		
		Thread.sleep(3000);
		
//		WebElement userElement = driver.findElement(By.name("username"));
//		userElement.sendKeys("texas@gmail.com");
		
		//driver.findElement(By.name("username")).sendKeys("ohio@sample.com");
		
		By username = By.name("username");
//		WebElement element = driver.findElement(username);
//		element.sendKeys("ahmet@gmail.com");
		
		ElementUtils.getElement(driver, username).sendKeys("last@gmail.com");
		
		

	}

}
