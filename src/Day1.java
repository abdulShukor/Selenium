import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int gotoframe(WebDriver driver1, By by)

	{

		driver1.switchTo().defaultContent();

		int i;

		int num = -1;

		int a = driver1.findElements(By.tagName("iframe")).size();

		for (i = 0; i < a; i++)

		{

			driver1.switchTo().defaultContent();

			driver1.switchTo().frame(i);

			int b = driver1.findElements(by).size();

			if (b > 0)

			{

				num = i;

				break;

			}

		}

		driver1.switchTo().defaultContent();

		return num;

	}

}
