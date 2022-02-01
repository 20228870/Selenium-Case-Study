package Tools.SeleniumAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selectable 

{

	public WebDriver driver;
	

	@Test
	public void List()
	{
	System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );		
	driver.get("https://demoqa.com/selectable/");
	
	driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")).click();
    System.out.println("you clicked on Cras justo odio");
	driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]")).click();
    System.out.println("you clicked on Dapibus ac facilisis in");
	driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[3]")).click();
    System.out.println("you clicked on Morbi leo risus");

	//  ***** Click on thi Grid  ***** //
		driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
		System.out.println("you clicked on Grid");
		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row1']/li[1]")).click();
		System.out.println("you clicked on One");
		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row1']/li[2]")).click();
		System.out.println("you clicked on Two");
		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row1']/li[3]")).click();
		System.out.println("you clicked on Three");
		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row2']/li[1]")).click();
		System.out.println("you clicked on Four");
		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row2']/li[2]")).click();
		System.out.println("you clicked on Five");
		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row2']/li[3]")).click();
		System.out.println("you clicked on Six");
//		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row3']/li[1]")).click();
//		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row3']/li[2]")).click();
//		driver.findElement(By.xpath("//div[@id='gridContainer']//div[@id='row3']/li[3]")).click();

		driver.quit();
	}	
	
}
