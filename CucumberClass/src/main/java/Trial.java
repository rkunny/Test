
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trial {

	@Test
	public void trial() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver2.37.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");	
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Rammohan");
	}
}
