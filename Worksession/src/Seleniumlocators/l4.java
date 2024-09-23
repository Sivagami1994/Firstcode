package Seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver ob= new ChromeDriver();
			//EdgeDriver ob= new EdgeDriver();
			ob.get("http://www.mycontactform.com");
			
			//css: casecade stylesheet
			// manual: 7 ways
			// shortcut: copy-> copy xpath
			
			//1.tagname and id    syntax: tagname#id
			//ob.findElementByCssSelector("input#user").sendKeys("hi");
			
			//2. tagname and classname     syntad: tagname.classname
			//ob.findElementByCssSelector("input.txt_log").sendKeys("hello");
			
			//3.tagname and attribute   syntax: tagname[attribute='value']
			//ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
			
			//4. tagname,classname  and attribute   syntax: tagname.classname[attribute='value']
			//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
			
			//5.tagname and  prefix of attribute   syntax: tagname[attribute^='prefix value']
			//ob.findElementByCssSelector("input[type^='te']").sendKeys("hi");
			
			//6.tagname and suffix of attribute   syntax: tagname[attribute$='suffix value']
			//ob.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
			
			//7.tagname and  substring attribute   syntax: tagname[attribute*='substring value']
			//ob.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
			//copy=> copy selector
			
			ob.findElementByCssSelector("#right_col_top > form > div > input").click();
		}
		}