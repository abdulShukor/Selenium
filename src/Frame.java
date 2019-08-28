import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) {

	 /*frame
	 * 
	 * HTML frames allow developers to present documents in multiple views, which
	 * may be independent windows or subwindows. Multiple views offer developers a
	 * way to keep certain information visible, while other views are scrolled or
	 * replaced. For example, within the same window, one frame might display a
	 * static banner, the second a navigation menu, and the third the main document
	 * that can be scrolled through or replaced by navigating in the second frame.
	 * 
	 * 
	 * code frame
	 * 
	 * 
	 * Working with Iframe and page content IFrame Is another web element and you
	 * can not locate Its element directly In selenium webdriver. To work with
	 * IFrame element In selenium webdriver, first of all you need to select that
	 * IFrame using syntax like bellow.
	 * 
	 * //switch to frame1. frame1 Is ID of frame. driver.switchTo().frame("frame1");
	 * 
	 * Now you can work with any element which Is Inside frame1. Now supposing you
	 * wants to switch back to page content then you need to use syntax like bellow.
	 * //Switch back to page content. driver.switchTo().defaultContent();
	 * 
	 * After above syntax execution, You can work with page elements.
	 * 
	 * Working with multiple frames on same page If there are multiple Iframes on
	 * single page then you can not directly navigate from Iframe1 to IFrame2. For
	 * that, You need to select page In between as bellow. //switch to frame1
	 * driver.switchTo().frame("frame1"); driver.findElement(By.xpath(
	 * "//td[contains(text(),'Cow')]/preceding-sibling::td/input[@type='checkbox']")
	 * ).click();
	 * 
	 * //Switch back to page content. driver.switchTo().defaultContent();
	 * 
	 * //switch to frame2 driver.switchTo().frame("frame2");
	 * driver.findElement(By.xpath("//input[@value='Boat']")).click();
	 */

	// action class method is mouse interaction, user gestures, keyboard action
	// composite action
	// frame
	// hew to run the code in different pages windows
	// frame is a container and it is independent of html, you can handle in normal
	// fashion handle accordingly
		// action using for moving or hover mouse interaction 
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	

	}
}

