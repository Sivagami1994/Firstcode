package Seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class css1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//ob.findElementByCssSelector("input#user").sendKeys("hi");
		
		//ob.findElementByCssSelector("input.txt_log").sendKeys("hello");
		
		//ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
		
		//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("class");

		//ob.findElementByCssSelector("input[type^='te']").sendKeys("prefix");
		
		//ob.findElementByCssSelector("input[type$='xt']").sendKeys("mid");
		
		//ob.findElementByCssSelector("input[type*='ex']").sendKeys("end");
		
		ob.findElementByCssSelector("#user").sendKeys("copypath");
		
	}

}
