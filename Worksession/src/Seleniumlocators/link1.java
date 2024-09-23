package Seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class link1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		ob.findElementByPartialLinkText("Forgotten").click();
	}

}
