package SeleniumbrowserUtility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class u1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		//changing the dimension of window by creating ob for dimesnion class 
		Dimension d= new Dimension(300,400);
		ob.manage().window().setSize(d);
		//create an obj for point class, pass desired x and y in value in it, apply it on window
		
		Point pt = new Point(100, 200);
		ob.manage().window().setPosition(pt);
		
		
	}

}
