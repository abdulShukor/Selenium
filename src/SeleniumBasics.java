import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//need download. you need .exe file for any browser you are using 
		// for chrome is chrome.driver.chrome
		// for firefox webdriver.gecko.driver
		//for ie webdriver.ie.webdriver
		
		//you must have these two steps
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//printing to the console
		//System.out.println(driver.getTitle());// validate the title
		//System.out.println(driver.getCurrentUrl());// validating the correct url
		//System.out.println(driver.getPageSource());// print the source code of the page 
		driver.get("http://yahoo.com");
		driver.navigate().to("http://centennailcollege.ca");// navigate from the current page to the target page 
		driver.navigate().forward();
		driver.navigate().back();
//		driver.close(); // it close the current browser 
		driver.quit();// it close all open browser. use for child windows

	}

}


