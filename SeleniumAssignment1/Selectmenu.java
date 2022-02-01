package Tools.SeleniumAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selectmenu 
{
	
	public WebDriver driver;

    @Test
    public void Selectvalue()
    {
    	
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );		
		driver.get("https://demoqa.com/select-menu");
		
		//*** Select Value ***//
	driver.findElement(By.id("withOptGroup")).click();
	driver.findElement(By.xpath("//div[text()='Group 2, option 1']")).click();
	
       //	**** Select One **** //
    driver.findElement(By.id("selectOne")).click();
	driver.findElement(By.xpath("//div[text()='Mrs.']")).click();
	
    //	**** Old Style select Menu **** //
    Select style = new Select(driver.findElement(By.id("oldSelectMenu")));
    style.selectByValue("4");
    
    
    //   *** Multiselect drop Down ***  //
    
//    driver.findElement(By.xpath("//div[@class=' css-2b097c-container']")).click();
//	driver.findElement(By.xpath("//div[text()='Select...']")).click();
//
//      driver.findElement(By.xpath("//div[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]")).click();
//      driver.findElement(By.xpath("//div[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[2]/div/div[1]")).click();

   //  ***  Standard multi select *** // 
	Select car = new Select(driver.findElement(By.id("cars")));
	car.selectByValue("opel");
			
	
		driver.quit();

    }
    }