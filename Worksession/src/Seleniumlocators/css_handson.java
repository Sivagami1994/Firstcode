package Seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class css_handson {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://demo.automationtesting.in/Register.html");
		
		//ob.findElementByCssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input").sendKeys("FN");
		
		ob.findElementByCssSelector("input[type='text']").sendKeys("FN");
		
		ob.findElementByCssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input").sendKeys("LN");
		
		ob.findElementByCssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea").sendKeys("Address");
		//ob.findElementByCssSelector("textarea.form-control ng-pristine ng-untouched ng-valid").sendKeys("Address");
		
		//ob.findElementByCssSelector("input[type='text']").sendKeys("Email");
		
		ob.findElementByCssSelector("#eid > input").sendKeys("Email");
		
		
		ob.findElementByCssSelector("input[type$='el']").sendKeys("12345");
		ob.findElementByCssSelector("input[value='Cricket']");
		ob.findElementByCssSelector("input[value='Male']");
		ob.findElementByCssSelector("input[value='FeMale']");
		
		
		
		
		
		
		
			

	}

}
