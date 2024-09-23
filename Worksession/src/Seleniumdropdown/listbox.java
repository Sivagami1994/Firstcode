package Seleniumdropdown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		WebElement ele = ob.findElementById("multiple-select-example");
		Select S = new Select(ele);
		S.selectByIndex(1);
		S.selectByValue("Orange");
		S.selectByVisibleText("Peach");
		
		Thread.sleep(3000);
		S.deselectByIndex(1);
		
		

	}

}
