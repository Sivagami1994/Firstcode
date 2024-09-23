package Seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class Z1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//Zooom in and Zoom out using execute scripts command
		ob.executeScript("document.body.style.zoom='300%'");
		Thread.sleep(3000);
		
		ob.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		
		ob.executeScript("document.body.style.zoom='30%'");
		Thread.sleep(3000);
		
		ob.quit();
		

	}

}
