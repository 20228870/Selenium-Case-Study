package Tools.SeleniumAssignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker 

{
	public WebDriver driver;

	@Test
	public void Selectdate()
	{

		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );		
		driver.get("https://demoqa.com/date-picker");
		
                //		****** Select Date ********  //
		driver.findElement(By.id("datePickerMonthYearInput")).click();
   		while (!driver.findElement(By.xpath("//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")).getText().contains("February")) 
   		{
   			driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
   		}

   		List<WebElement> datelist = driver.findElements(By.className("react-datepicker__day"));

   		for (int i = 0; i < datelist.size(); i++) {
   			String t = datelist.get(i).getText();
   			System.out.println("Text is: " + t);

   			if (t.equalsIgnoreCase("25")) {
   				datelist.get(i).click();
   				break;
   			}
   		}
		
   		driver.quit();
   		
		}
	
	
}