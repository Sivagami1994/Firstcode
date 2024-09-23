package Seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class collectiontags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
ob.get("http://www.mycontactform.com");
		
		List<WebElement> i = ob.findElementsByTagName("img");
		System.out.println("Number of images"+i.size());
		
		List<WebElement> i1 = ob.findElementsByTagName("a");
		System.out.println("Number of tag"+i1.size());
		
		List<WebElement> i2 = ob.findElementsByTagName("input");
		System.out.println("Number of input"+i2.size());
		
		List<WebElement> i3 = ob.findElementsByTagName("div");
		System.out.println("Number of div"+i3.size());
		
		ob.quit();
		
		
	}

}
