package Seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		ob.switchTo().frame(0);		
		ob.findElementById("datepicker").click();		
		//mnth
		for(int i=0;i<3;i=i+1)
		{
			ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		
		//day
		ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a").click();

	}

}
