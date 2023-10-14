import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4TextBox {

	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Suraj\\drivers\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Suraj Unnikrishnan");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("krishsurajku@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Earum elit rerum vo");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Ut aut aute voluptat");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String message = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).getText();
		System.out.println(message);
		System.out.println("Test is Passed");
		//driver.quit();
	}

}
