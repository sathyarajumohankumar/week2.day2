package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acmetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://acme-test.uipath.com/login");
driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.id("password")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

//	driver.findElement(By.linkText("Log Out"));
String titnam=driver.getTitle();
System.out.println(titnam);
driver.findElement(By.linkText("Log Out")).click();
Thread.sleep(3000);
driver.close();


	}

}
