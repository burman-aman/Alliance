package alliance_data;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
		protected static WebDriver driver;
		
	public static void main(String[] args) {
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.23.0\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://dev.adsdriven.org/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//*[@name='email']")).sendKeys("qateam@bigkittylabs.com");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Password@1");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			//Change later
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//*[@class='menu-item active']")).click();
			driver.findElement(By.xpath("//*[@class='//*[@class='btn btn-primary max-w-160 m-w-100 waves-effect waves-light']")).click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
