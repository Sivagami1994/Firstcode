package Seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		List<WebElement> i4 = ob.findElementsByTagName("div");
		System.out.println("Number of div"+i4.size());
		
		ob.quit();
		

	}

}
