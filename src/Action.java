import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You can find more examples from below link
		 * 
		 * https://techblog.polteq.com/en/perform-a-sequence-of-actions-with-selenium-
		 * webdriver/ The Selenium WebDriver's Advanced User Interactions API allows us
		 * to perform operations from keyboard events and simple mouse events to complex
		 * events such as dragging-and-dropping, holding a key and then performing mouse
		 * operations by using the Actions class, and building a complex chain of events
		 * exactly like a user doing these manually. The Actions class implements the
		 * builder pattern to create a composite action containing a group of other
		 * actions
		 * 
		 * We need to create an instance of the Actions class by passing the instance of
		 * driver class to the constructor in the following way: Actions builder = new
		 * Actions(driver);
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
