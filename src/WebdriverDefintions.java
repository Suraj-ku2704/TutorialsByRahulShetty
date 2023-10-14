import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverDefintions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "C:\\\\Suraj\\\\drivers\\\\chromedriver_win32.exe");
		
		//Below webdriver object will invoke only 1 browser instance, no matter how many times it is invoked
		WebDriver driver1 = new ChromeDriver();
		
		//for example, below urls will be invoked in the same browser instance.
		driver1.get("https://demoqa.com/");
		driver1.get("https://www.facebook.com/");
		
		
		/*InOrder to invoke separate browser instance simultaneously (for parallel testing), 
		  define separate driver webdriver objects as below*/
		WebDriver driver2 = new ChromeDriver();
		WebDriver driver3 = new ChromeDriver();
		
		driver2.get("https://demoqa.com/");
		driver3.get("https://demoqa.com/");
		
	}

}
