package antJenkinRevisionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class antJenRevisionClass {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Firefox Nightly\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Jenkins");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
	}

}
