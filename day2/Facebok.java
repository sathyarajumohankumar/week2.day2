package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("sathya");
driver.findElement(By.name("lastname")).sendKeys("rajumohankumar");
driver.findElement(By.name("reg_email__")).sendKeys("sathyarajumohan@gmail.com");

driver.findElement(By.id("password_step_input")).sendKeys("sairam");

WebElement dayele = driver.findElement(By.id("day"));
Select day=new Select(dayele);
day.selectByValue("1");
WebElement monele = driver.findElement(By.id("month"));
Select mon=new Select(monele);
mon.selectByValue("1");

WebElement yearele = driver.findElement(By.id("year"));
Select year=new Select(yearele);
year.selectByValue("2021");
driver.findElement(By.xpath("//label[text()='Female']")).click();

		
}
	

}
