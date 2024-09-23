package Seleniumdropdown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		// create an object for select class
		// pass dropdown box as input
		// index/valur/visible text
		
		WebElement ele = ob.findElementById("carselect");
		Select s= new Select(ele);
		
		//s.selectByIndex(1);
		//s.selectByValue("benz");
		//s.selectByVisibleText("Benz");
//s.selectByIndex(2);	
s.selectByIndex(3);	
	
	}

}
