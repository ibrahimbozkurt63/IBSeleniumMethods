package Methods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_002_WebDriverFF {

	public static void main(String[] args) {
		
		//Set Property
		System.setProperty("webdriver.gecko.driver", "/Users/bobit/Documents/Drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://siliconelabs.com/");
		
		//Get title
		String title = driver.getTitle(); //actual result
		System.out.println("Page title is "+ title);
		
		//Validation == verify
		if(title.equals("Silicone Labs")) { //expected result
			System.out.println("title is correct");
		}else {
			System.out.println("title is NOT correct");
		}
		
		//driver.close();
		driver.quit();
		
		
		System.out.println("test is done");
				
		
	}

}
