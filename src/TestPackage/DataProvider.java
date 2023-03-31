package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
  WebDriver driver;
  @BeforeMethod
  public void test() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
  @org.testng.annotations.DataProvider(name="testdata")
  public Object[][] getdata(){
	  Object[][]data=new Object[3][2];
	  data[0][0]="user1";
	  data[0][1]="123";
	  data[1][0]="user2";
	  data[1][1]="456";
	  data[2][0]="user3";
	  data[2][1]="789";
	  return data;
  }
  @Test(dataProvider = "testdata")
  public void login(String username,String password) {
	  //WebDriver driver=new ChromeDriver();
	  driver.findElement(By.name("email")).sendKeys(username);
	  driver.findElement(By.name("pass")).sendKeys(password);
	  driver.findElement(By.name("login")).click();
  }
  
}
