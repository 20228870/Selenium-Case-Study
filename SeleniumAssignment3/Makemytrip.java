package Tools.SeleniumAssignment3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Makemytrip 
{

	WebDriver driver;


@SuppressWarnings("deprecation")
@Test
public void Select_from() throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
driver.get("https://www.makemytrip.com/");

Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Bengaluru");


List<WebElement>dynamicList=driver.findElements(By.xpath("//div[text()='Bengaluru, India']"));

for(int i=0;i<dynamicList.size();i++)
{

   String text=dynamicList.get(i).getText();
   System.out.println("Text is"+text);
   if(text.contains("Bengaluru"))
   {
	   dynamicList.get(i).click();
	   break;
   }
  }
}
@Test
public void Select_to() throws InterruptedException 
{

Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("Bengaluru");


List<WebElement>dynamicList=driver.findElements(By.cssSelector("//div[text()='Vijayawada, India']"));

for(int i=0;i<dynamicList.size();i++)
{

   String text=dynamicList.get(i).getText();
   System.out.println("Text is"+text);
   if(text.contains("Bengaluru"))
   {
	   dynamicList.get(i).click();
	   break;
   }
  }
}


@Test
public void select_the_departure_date_future_date() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
	  Thread.sleep(5000);
	  
	  String flag = "False";
	 

	  while(flag=="False") {
	   
	   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).size()>0) {
	    
	   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).click(); 
	   flag="True";
	   Thread.sleep(5000);
	   }
	   
	   else {
		   Thread.sleep(5000);
		    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		      
		  }
		  
		  
		  System.out.println("Test case is passed");
		  
		    
		 }



@Test
public void select_the_traveller_details_and_travel_class() throws InterruptedException {
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[2]")).click();

driver.findElement(By.xpath("//ul[@class=specialFareNew]/li[3]")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/p/a")).click();

}


@Test
public void search_for_lowest_price() {
driver.findElement(By.xpath("div[@class='ViewFareBtn active text-uppercase ']")).click();
String price=driver.findElement(By.id("bookbutton-RKEY:5337771c-3fdb-4d12-b0e6-d0b8c809dada:1_0")).getText();
String str=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/div/div[2]/span/span")).getText();
System.out.println("Lowest price is: "+price+"\n and discount is:"+str);
}


@Test
public void after_searching_click_on_book_now_button() {
driver.findElement(By.xpath("//*[@class='srp-card-uistyles__BookButton-sc-3flq99-21 bgObmb dF justifyCenter alignItemsCenter txtUpper']")).click();
String Text=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]")).getText();
System.out.println(Text);
}


@Test
public void review_the_selection_in_the_review_page() {
System.out.println("Review page is not found");

driver.quit();
}
}


