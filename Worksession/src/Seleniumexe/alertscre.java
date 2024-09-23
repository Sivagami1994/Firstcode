package Seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertscre {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.letskodedit.com/practice");
		ob.executeScript("window.confirm('timeout')");
		
		Thread.sleep(3000);
		
		Alert a = ob.switchTo().alert();
		a.accept();
		

	}

}
