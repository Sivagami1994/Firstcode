package Demosession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//ob.get("");
		ob.get("https://www.google.com/");
		ob.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		ob.findElementByLinkText("Images").click();
		
		Thread.sleep(2000);
		
		ob.navigate().back();
		
	Thread.sleep(2000);
		
		ob.navigate().forward();


	}

}
