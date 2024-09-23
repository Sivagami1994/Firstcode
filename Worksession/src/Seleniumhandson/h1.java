package Seleniumhandson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class h1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(3000);
		ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button").click();
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/button[1]").click();
		Thread.sleep(3000);
		ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > input").sendKeys("Siva");
        Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input").sendKeys("Sethu");
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input").sendKeys("641035");
		Thread.sleep(3000);
		ob.findElementByCssSelector("button[type='submit']").click();
		Thread.sleep(3000);		
		Alert a = ob.switchTo().alert();
		a.accept();		
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/button[2]").click();
		Thread.sleep(3000);
		//ob.findElementById("userSelect").click();
		WebElement ele = ob.findElementById("userSelect");
		Select s= new Select(ele);
		s.selectByIndex(1);
		WebElement ele1 = ob.findElementById("currency");
		Select s1= new Select(ele1);
		s1.selectByIndex(3);
		ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > button").click();
		Thread.sleep(3000);
		Alert a1 = ob.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
		//ob.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/button[3]").click();
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/button[3]").click();
		Thread.sleep(3000);
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input").sendKeys("Siva");
		ob.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button").click();
	}

}
