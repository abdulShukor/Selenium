import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		// when using text make sure check for space before and after 
		
		// traverse through the parent node to the child if the child node is static 
		// //tagname[@attribute='ad']/div/div/[2 mean second child]/input
		// it the it dynamic then use sibling or parent relashionship 
	// first is // and then / dev
		
		// 
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		// parent tag is dynamic and one of its sibling is constant

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		// using child xapth identify parent xpath 
		// this is only possible in xpath you can traverse back but with css yo connat  traverse back.
		// check first in tool like firepath
		// with css you can do it without tag name 
		// with #ID and with class .classname
		// find unique if has the same field more fields, find unique attribute 
 
	}

}
