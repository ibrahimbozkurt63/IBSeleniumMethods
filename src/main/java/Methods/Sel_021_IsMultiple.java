package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_021_IsMultiple {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
      WebDriverManager.chromedriver().setup();
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.setHeadless(false);
      driver = new ChromeDriver(chromeOptions);
      driver.get("https://www.facebook.com/r.php");
      
	    WebElement day = driver.findElement(By.id("day"));
	  	WebElement month = driver.findElement(By.id("month"));
	  	WebElement year = driver.findElement(By.id("year"));
	  	
	  	Select select = new Select(month);
	  	//dropdown is multiple or not
	  	System.out.println(select.isMultiple());
	  	select.selectByIndex(3);
	  	//To verify dropdown is selected or not
	  	WebElement option = select.getFirstSelectedOption();
	  	String seelctedText = option.getText();
	  	System.out.println(seelctedText);
	}

}
