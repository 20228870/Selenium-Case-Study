package Tools.SeleniumAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop 

{
	public WebDriver driver;

	@Test
	public void Toolsdrag()
	{
	System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );		
	driver.get("https://demoqa.com/droppable/");
	

	Actions builder = new Actions(driver);
	 
	WebElement from = driver.findElement(By.id("draggable"));
	 
	WebElement to = driver.findElement(By.id("droppable"));	 
	//Perform drag and drop
	builder.dragAndDrop(from, to).perform();
	
	//verify text changed in to 'Drop here' box 
	String textTo = to.getText();

	if(textTo.equals("Dropped!")) {
		System.out.println("PASS: Source is dropped to target as expected");
	}else {
		System.out.println("FAIL: Source couldn't be dropped to target as expected");
	}

	driver.close();

}	
	
	}


