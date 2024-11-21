package alliance_data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ChangePasswordTest {
	
	protected WebDriver driver;
	@Test
	public void test01() {
		driver.findElement(By.xpath("//*[@autocomplete='new-password' and @name='password']")).sendKeys("Password12");
		driver.findElement(By.xpath("//*[@id='password_confirmation']")).sendKeys("Password12");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
}
