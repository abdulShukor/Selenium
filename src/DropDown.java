import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// when we have static dropdown
//		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
//
//		dropdown.selectByIndex(4);
//
//		dropdown.selectByVisibleText("9 Adults");
//
//		dropdown.selectByValue("8");
		driver.get("http://spicejet.com"); //URL in the browser

		driver.findElement(By.id("divpaxinfo")).click();
		// Thread.sleep(2000L);
		// like adding five adult or children which has + sign
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("divpaxinfo")).click();
			// Thread.sleep(2000L);
			i++;

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		driver.findElement(By.id("divpaxinfo")).getText();

//		// when we have dynamic dropdown 
//		driver.findElement(By.id("divpaxinfo")).click();
//
//		   Thread.sleep(2000L);
//
//		   /*int i=1;
//
//		while(i<5)
//
//		{
//
//		driver.findElement(By.id("hrefIncAdt")).click();//4 times
//
//		i++;
//
//		}*/
//
//		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//		for(int i=1;i<5;i++)
//
//		{
//
//		driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
//
//		driver.findElement(By.id("btnclosepaxoption")).click();
//
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText();
	}

}
