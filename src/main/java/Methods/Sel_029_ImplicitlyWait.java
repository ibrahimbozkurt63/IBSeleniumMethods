package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_029_ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		//This wait tells the webdriver to wait if the element is not available immediately
		//and webdriver waits until the element is visible in specific time
		//NoSuchElementException
		//Imp wait can be used only web element
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		System.out.println("title is "+ driver.getTitle()); //non webelement
		
		//Synchronization

	}

}
