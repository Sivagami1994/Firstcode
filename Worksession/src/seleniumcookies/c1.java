package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.letskodeit.com/practice");

		Set<Cookie> s= ob.manage().getCookies();
		System.out.println("Number of cookies" + s.size());
		
		ob.manage().deleteAllCookies();
		
		Set<Cookie> s1 = ob.manage().getCookies();
		System.out.println("Number of cookies after deletion" +s.size());
		
		ob.quit();
	}

}
