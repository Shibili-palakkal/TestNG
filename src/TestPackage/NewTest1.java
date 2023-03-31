package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority = 1)
  public void test1() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver1=new ChromeDriver();
//	  driver1=new ChromeDriver();
	  driver1.manage().window().maximize();
	  driver1.get("https://www.google.com/");
	  driver1.findElement(By.name("q")).sendKeys("flower");
	  driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver1.findElement(By.name("btnK")).click(); 
	  driver1.quit();
	 
	  
  }
  @Test(priority = 2)
  public void test2() {
	  WebDriver driver2=new ChromeDriver();
	  driver2.manage().window().maximize();
	  driver2.get("https://www.google.com/");
      driver2.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("flipkart");
//	  driver2.findElement(By.name("btnK")).click();  
	  WebElement elementclickElement=driver2.findElement(By.name("btnK"));
	  elementclickElement.sendKeys(org.openqa.selenium.Keys.ENTER);
	  driver2.quit();
	
	  
	
  }
  @Test(priority = 3)
  public void test3() {
	  WebDriver driver3=new ChromeDriver();
	  driver3.manage().window().maximize();
	  driver3.get("https://www.demo.guru99.com/v3/");
	  driver3.findElement(By.name("uid")).sendKeys("mngr448080");
	  driver3.findElement(By.name("password")).sendKeys("UtypUsE");
	  driver3.findElement(By.name("btnLogin")).click();
	  driver3.quit();
	
	  
	  
  }
  @Test(priority = 4)
  public void test4()  {
	  WebDriver driver4=new ChromeDriver();
	  driver4.manage().window().maximize();
	  driver4.get("http://festo-ce.yes45.in/");
	  driver4.findElement(By.xpath("/html/body/div/div/div/a")).click();
	  driver4.findElement(By.name("email")).sendKeys("ce@fezto");
	  driver4.findElement(By.name("password")).sendKeys("4242");
	  driver4.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();
	  driver4.quit();
	 
	  
	 
	   
  }
}
