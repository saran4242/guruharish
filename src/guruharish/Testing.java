package guruharish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAKUMAR\\eclipse-workspace\\Saravanan\\guruharish\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
	
	    driver.get("https://www.facebook.com");
	    
	    
	    System.out.println();
	
	}
	
	
	

}
