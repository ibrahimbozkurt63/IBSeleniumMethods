package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_017_Dropdown_1 {
	
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
	
	Select selectDay = new Select(day);
	//selectDay.selectByIndex(9);
	selectDay.selectByValue("31");
	Select selectMonth = new Select(month);
	selectMonth.selectByVisibleText("Feb");
	Select selectYear = new Select(year);
	//selectYear.selectByVisibleText("2018");
	selectYear.selectByValue("2017");
	
	}

}
