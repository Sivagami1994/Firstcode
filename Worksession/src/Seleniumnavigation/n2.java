package Seleniumnavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class n2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91735\\Documents\\Selenium java class docs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    
	   //open seleniumeasy.com in new tab   
	 driver.executeScript("window.open('https://www.mycontactform.com','_blank');");
	  

	 //get the control of first tab: driver.getwindowhandle()=> String => parent
	 //get the control of both tabs: driver.getwindowhandles() s1={google, seleniumeasy.com}
	 
	 

	  String parent=driver.getWindowHandle();// control will be in the parent window //google
	 // collecting all the handle
	  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
	  
	  
	  //step3: iteration
	 
	  
	// iterate through the elements present in set
	  Iterator<String> I1 = s1.iterator();  // hasNext , next()



	  while(I1.hasNext())// whether any content is there 
	  {
	      String child_window=I1.next();
	      if(!parent.equals(child_window))// picking the seleniumeasy.com
	    	  { // control is moved to child window 
	        driver.switchTo().window(child_window);
	        System.out.println(driver.getTitle());
	        Thread.sleep(4000);
	        driver.findElementByLinkText("Help").click();
	        Thread.sleep(4000);
	        driver.close();
	      } 
	    }
	  
	  /*parent: google
	   * s1={google.com. mycontactform.com}
	   * 
	   * step1: I1 point to google com
	   * I1.hasnext
	   *     I1.next reads google.com    child_window=gooogle
	   *     if parent!=child
	   *        google!=google
	   *        
	   * step2" I points to second element
	   *      I1.hasnext()
	   *         I1.next reads mycontactform.com   child_window=mycontactform.com
	   *         if parent!=child_window
	   *            google!=mycontactform.com 
	   *              moving cursor to mycontactfornm.com
	   *              title
	   *              4 seconds
	   *              Hel[
	   *              4 seconds 
	   *              close 
	   *       * 
	   * */
	  driver.switchTo().window(parent);//google 
	  System.out.println(driver.getTitle());// google
	  //driver.findElement(By.linkText("Images")).click();
	  Thread.sleep(5000);
	  driver.findElementByLinkText("Images").click();
	  Thread.sleep(5000);
	  driver.quit();
	}

	//facebook : title
	// google.com: Privacy 
	// facebook: cookies


	// frst: mycintactform.com  login
	// second: google           selenium search



	}


