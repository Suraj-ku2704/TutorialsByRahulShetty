import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebdriverDifferentBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "C:\\\\Suraj\\\\drivers\\\\chromedriver_win32.exe");
		System.setProperty("WebDriver.chrome.driver", "C:\\\\Suraj\\\\drivers\\\\edgerdriver.exe");
		
		ChromeOptions ChromeOptions = new ChromeOptions();
		EdgeOptions EdgeOptions = new EdgeOptions();
		
		ChromeOptions.addArguments("--start-maximized");
		EdgeOptions.addArguments("--start-maximized");
		
		WebDriver driver1 = new ChromeDriver(ChromeOptions);
		WebDriver driver2 = new EdgeDriver(EdgeOptions);
		
		driver1.get("https://demoqa.com/");
		driver2.get("https://demoqa.com/");
	}

}
