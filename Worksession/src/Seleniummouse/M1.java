package Seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M1 {

	public static void main(String[] args) {
		/*
		 *click
		 *double click
		 *right click
		 *mouse hovering
		 *click, hold and release
		 *drag and droo
		 *drag and drop by
		 *
		 * create an object for actions class
		 * pass driver objecta s input
		 * 
		 * 
		 * */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
ob.get("http://www.mycontactform.com");
				
	WebElement ele = ob.findElementByClassName("btn_log");

	Actions ac= new Actions(ob);
	//ac.click(ele).build().perform();
	//ac.doubleClick(ele).build().perform();
	//ac.contextClick(ele).build().perform();
	ac.moveToElement(ele).click().build().perform();
	//ac.clickAndHold(ele).build().perform();
	//Thread.sleep(3000);
	//ac.release(ele).build().perform();

	}

}
