package Methods;

import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_039_FrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo.frame
		//Frame is defined in html under the frameset tag
		//Thi is part of the webpage
		
		
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.name("main")));
		System.out.println(driver.getTitle());
		
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(), 'Title bar ')]"));
		System.out.println(header.getText());
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		System.out.println(header.getText()); // org.openqa.selenium.StaleElementReferenceException
	}

}
