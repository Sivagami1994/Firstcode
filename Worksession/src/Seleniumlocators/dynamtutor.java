package Seleniumlocators;

public class dynamtutor {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver ob= new ChromeDriver();
			//EdgeDriver ob= new EdgeDriver();
			ob.get("http://www.mycontactform.com");
			
			//following
			//preceding
			
			//parent
			//child
			
			//following-sibling
			//preceding-sibling
			
			// usernametext=> login
			
		   //	ob.findElementByXPath("//*[@id=\"user\"]//following::input[2]").click();
			
			//login=> username
			
			//ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input//preceding::input[2]").sendKeys("hi");
			
			//parent=> child
			//System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[3]").getText());
			
			//child=> parent
			
			//System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[3]//parent::div").getLocation());
			
			//following-sibling
			//System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//following-sibling::p[4]").getText());
			
			System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//preceding-sibling::p[1]").getText());
		}


	}

}
