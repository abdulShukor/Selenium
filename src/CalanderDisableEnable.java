import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderDisableEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// if some thing is disable even if you click on it  will stay as it is 
		//  using isEnable() and isDisable() methods .
		// what is the attribute the something is change when you are disable or enable 
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		// this step getting the object CSS property 
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		//Assert.assertTrue(true);

		}

		else

		{

		//Assert.assertTrue(false);

		}
		

	}

}
