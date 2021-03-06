package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_023_DropdownWithoutSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		//First select all options
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(dayList.size());
		
		//Second print all values on the console
		for(int i = 0; i<dayList.size(); i++) {
			String text = dayList.get(i).getText();
			System.out.println(text);
		
	   //Third select and click specific option
			if(text.equals("10")) {
				dayList.get(i).click();
				break;
			}
		}
	
	}

}
