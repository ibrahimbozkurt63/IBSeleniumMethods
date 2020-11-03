package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_016_FindElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); //no need local driver
		//System.setProperty(key, value) //local driver
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//https://mail.rediff.com/cgi-bin/login.cgi
		//findelements
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//Size
		System.out.println(linkList.size());
		
		//To get links
		for(int i=0; i<linkList.size(); i++) {
			String text = linkList.get(i).getText();
			//System.out.println(text);
			
			if(!text.isEmpty()) {
				System.out.println(text);
			}
			
			if(text.equals("Forgot Password?")) {
				linkList.get(i).click();
				break;
			}
		}
	
	}

}
