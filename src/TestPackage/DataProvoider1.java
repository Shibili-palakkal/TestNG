package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.DataProviderInvocationException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;

import net.bytebuddy.asm.Advice.Return;

public class DataProvoider1 {
WebDriver driver;
@BeforeMethod
  public void test1() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
  }
@DataProvider(name="testdata")
public Object[][]getdata(){
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
public void login(String username,String passwrod) {
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(passwrod);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
}
}
