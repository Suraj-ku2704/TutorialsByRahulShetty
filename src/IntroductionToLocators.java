import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "C:\\Suraj\\drivers\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://demoqa.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div)[13]")).click();*/
		
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("//span[@class='text'])[3]"));
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		String message1 = driver.findElement(By.cssSelector("span.text-success")).getText();
		System.out.println(message1);
		//String message = driver.findElement(By.cssSelector("//*[@id=\"app\"]/div/div/div[2]/div[2]/text()")).getText();
		//System.out.println(message);
		//driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		//driver.findElement(By.cssSelector("input#userName")).sendKeys("Suraj");
		//driver.close();
		
	}

}
