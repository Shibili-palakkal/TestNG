package TestPackage;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 1)
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
  }
   @Test(priority = 2)
  public void VerifyTitle() {
	   WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  String pageTitleString=driver.getTitle();
	  Assert.assertEquals(pageTitleString,"Google");
	  }
  
@Test(priority = 3)
public void closeBrowser() {
	WebDriver driver=new ChromeDriver();
	driver.close();
}
}
