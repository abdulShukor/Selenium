import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

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
		System.out.println(driver.getTitle());

	}

}


