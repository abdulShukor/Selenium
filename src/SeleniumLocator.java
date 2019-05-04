import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver”,”C:\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// locator by ID, name ,classname, linktext, xpath and css
		// driver.get("http://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("this first code excersice");
//		driver.findElement(By.id("pass")).sendKeys("1234");
//		driver.findElement(By.linkText("Forgot account?")).click();
		// you can find it by name and also classname too,css and xpath
//		
//		driver.quit();
//		
		// System.out.println(driver.findElement(By.id("1")).getText());

		driver.get("http://facebook.com"); // URL in the browser
		// driver.findElement(By.className("inputtext")).sendKeys("helloworld");
		/*
		 * driver.findElement(By.id("email")).sendKeys("Thisis my first code");
		 * driver.findElement(By.name("pass")).sendKeys("123456");
		 * driver.findElement(By.linkText("Forgot account?")).click();
		 */

		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		// driver.findElement(By.className("button r4 wide primary")).click();//Error it
		// Cannot print component class you need to add . instead of spaces
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		// for css you do .id or #class name 
		
		//    // tagName[@attribute='value'] - xpath the star * will accept any tag 
		/*
		 * driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
		 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		 * driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 */

		// tagName[attribute='value'] -CSS
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("[value='Log In']")).click();// you can do without tag name
		driver.get("http://rediff.com");
		
		//css regular expression for value that keeps changing 
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		

		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		//xpath  regular expression for value that keeps changing 

		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		driver.quit();

	}

}
