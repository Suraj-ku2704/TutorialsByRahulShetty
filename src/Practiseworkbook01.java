import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiseworkbook01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.gecko.driver", "C:\\Suraj\\drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ecommerce.artoftesting.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//driver.findElement(By.cssSelector(".Login_closeModal__JbdLy")).click();
		//driver.findElement(By.xpath("//div[11]//div[4]//button[1]")).click();
		
		 WebElement element1 = driver.findElement(By.cssSelector("input#uname"));
		 WebElement element2 = driver.findElement(By.cssSelector("input#pass"));
		
		 element1.clear();
		 element1.sendKeys("banned_user");
		 element2.clear();
		 element2.sendKeys("banned_password");
		 
		 driver.findElement(By.cssSelector("button.Login_btn__pALc8")).click();
		 WebElement element3 = driver.findElement(By.xpath("//span[contains(@class,\"Login_error\")]"));
		 
		 String errormsg = element3.getText();
		 System.out.println(errormsg);
		 
		 Assert.assertEquals(errormsg, "Invalid username or password!");
		 driver.quit();
		


	}

}
