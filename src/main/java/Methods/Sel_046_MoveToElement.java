package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_046_MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.verizon.com/");
		Thread.sleep(5000);
		
		WebElement shopMenu = driver.findElement(By.id("gnav20-Shop-L1"));

		Actions actions = new Actions(driver);
	
		actions.moveToElement(shopMenu).build().perform();
		
		WebElement smartPhones = driver.findElement(By.id("gnav20-Shop-L3-1"));
		Thread.sleep(5000);
		smartPhones.click();
		//actions.click(courseLink);


	}

}
