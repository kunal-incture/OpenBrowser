import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static void main(String args[]) {

		WebDriver driver = new FirefoxDriver();
		System.out.println("Hello Google...");
		driver.get("http://google.com");

	}

}
