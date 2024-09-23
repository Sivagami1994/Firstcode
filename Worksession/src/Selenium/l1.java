package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

	// add library -//right click=> properties=> java buildpath=> libraries=> classpath=> add external jar=> browser=> jar => click on apply and close
		
		public static void main(String[] args) {
			
			//step1:  configuring the chrome driver
			//step2: creating an object for chromedriver class 
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver ob= new ChromeDriver();
			ob.get("http://www.facebook.com");

}
}

