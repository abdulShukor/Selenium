import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        // driver.get("http://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("this first code excersice");
//		driver.findElement(By.id("pass")).sendKeys("1234");
//		driver.findElement(By.linkText("Forgot account?")).click();
		// you can find it by name and also classname too,css and xpath 
//		
//		driver.quit();
//		
	  //System.out.println(driver.findElement(By.id("1")).getText());
		
		
	}

}
