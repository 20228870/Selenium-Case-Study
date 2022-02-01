package Tools.SeleniumAssignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Contactform 
{
	public WebDriver driver;

	@Test
	public void Toolsform() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );		
	driver.get("https://demoqa.com/automation-practice-form");
	
	driver.findElement(By.id("firstName")).sendKeys("Mohan");
	driver.findElement(By.id("lastName")).sendKeys("Reddy");
	driver.findElement(By.id("userEmail")).sendKeys("mohan.reddy18@wipro.com");
	Thread.sleep(3000);

	
    driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("English");

	
   
	}
	
  

}
