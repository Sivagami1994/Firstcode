package Seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handson {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/div[1]/button").click();
		Thread.sleep(3000);
		WebElement ele = ob.findElementById("userSelect");
		Select s= new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/form/button").click();
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[3]/button[2]").click();
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input").sendKeys("1000");
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[4]/div/form/button").click();
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[3]/button[3]").click();
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input").sendKeys("300");
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[4]/div/form/button").click();
		Thread.sleep(3000);
		ob.close();
		
	}

}
