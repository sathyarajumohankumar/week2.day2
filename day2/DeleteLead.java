package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://Leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();

//driver.findElement(By.xpath("//input[@class='x-tab-strip-text']")).click();
driver.findElement(By.xpath("//a[@class='x-tab-strip-close']/preceding::span[@class='x-tab-strip-text ']")).click();
	
driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("0424");

	driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("989477");
	
	}
}
