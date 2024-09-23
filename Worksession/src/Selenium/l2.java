package Selenium;


import org.openqa.selenium.edge.EdgeDriver;

public class l2 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.edge.driver", "C:\\Users\\91735\\Documents\\Selenium java class docs\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver ob= new EdgeDriver();
		ob.get("http://www.facebook.com");
		ob.manage().window().maximize();
		
		for (int i=0;i<3;i++)
		{
			ob.navigate().refresh();
		}
		
		//process
		Thread.sleep(3000);
		
		ob.quit();

	}

}
