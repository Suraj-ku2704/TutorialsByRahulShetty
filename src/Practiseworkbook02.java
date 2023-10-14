import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiseworkbook02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Suraj\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String Password = GetPassword(driver); 
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Suraj");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(Password);
		driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
		driver.quit();
		

	}
	
public static  String GetPassword(WebDriver driver) throws InterruptedException

{
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Suraj");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("krishsurajku@gmal.com");
	driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8754657815");
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	String InfoMsg = driver.findElement(By.cssSelector("p.infoMsg")).getText();
	System.out.println(InfoMsg);
	//Please use temporary password 'rahulshettyacademy' to Login.	
	String PasswordArray1[] = InfoMsg.split("'");
	String PasswordArray2[] = PasswordArray1[1].split("'");
	return PasswordArray2[0];
	
}

}
