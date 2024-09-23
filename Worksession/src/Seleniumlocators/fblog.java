package Seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class fblog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		ob.findElementByName("email").sendKeys("sundarisethupathi@gmail.com");
		ob.findElementById("pass").sendKeys("Maharishi-94");
		ob.findElementByName("login").click();


	}

}
