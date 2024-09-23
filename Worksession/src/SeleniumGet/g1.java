package SeleniumGet;

import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		//title
		System.out.println(ob.getTitle());
		//URL
		System.out.println(ob.getCurrentUrl());
		//size: height and widhth of window
		System.out.println(ob.manage().window().getSize());
		
		//position x and y
		System.out.println(ob.manage().window().getPosition());
		//getting browser capabilities
		System.out.println(ob.getCapabilities());
		ob.quit();
		
		
	}

}
