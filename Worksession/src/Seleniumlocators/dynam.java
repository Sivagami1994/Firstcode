package Seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class dynam {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		/*one method
		ob.findElementByXPath("//*[@id=\"user\"]//following::input[1]").sendKeys("hi");
		Thread.sleep(2000);
		ob.findElementByXPath("//*[@id=\"user\"]//following::input[2]").click();
		**/
		
		System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[3]").getText());

		System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[3]").getText());
		//
		
		System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[3]//parent::div").getLocation());
		
		System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[3]//parent::div").getLocation());		
		
		System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//following-sibling::p[4]").getText());
		ob.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
