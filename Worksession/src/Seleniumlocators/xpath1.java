package Seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		
		//ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
		
		ob.findElementByXPath("//*[@id='user']").sendKeys("Dhivyakarthi123");
		ob.findElementByXPath("//input[@type='password']").sendKeys("12345");	
		ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
		
		
	}

}
