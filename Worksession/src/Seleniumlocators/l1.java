package Seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		ob.findElementByName("pass").sendKeys("12345");	
		ob.findElementByName("btnSubmit").click();

	}

}
