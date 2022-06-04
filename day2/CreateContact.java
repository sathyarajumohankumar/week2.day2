package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
	

		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://Leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("sairam");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sree");
driver.findElement(By.id("createContactForm_description")).sendKeys("info");
driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sai@gmail.com");
driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("jairam");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("dev");
driver.findElement(By.id("createContactForm_departmentName")).sendKeys("selenium");
WebElement cre = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
Select cres=new Select(cre);
cres.selectByVisibleText("New York");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
//driver.findElement(By.linkText("Edit")).click();

//driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']/following::input[@class='smallSubmit']")).click();
driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();		
driver.findElement(By.id("updateContactForm_description")).clear();
driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("hello");
driver.findElement(By.xpath("//input[@value='Update']")).click();
String con = driver.getTitle();
System.out.println(con);


}
}