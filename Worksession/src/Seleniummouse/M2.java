package Seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		
	//webelements: present inside the frame
		// switch ur control to that frame
		//id, index, name
		
		ob.switchTo().frame(0);
     Actions ac= new Actions(ob);
     WebElement e1 = ob.findElementById("draggable");
     WebElement e2 = ob.findElementById("droppable");
     ac.dragAndDrop(e1, e2).build().perform();

	}

}
