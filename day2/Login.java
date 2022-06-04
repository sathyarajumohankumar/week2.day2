package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	//driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sathya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajumohankumar");

driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("test");
WebElement sour = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sourr=new Select(sour);
sourr.selectByVisibleText("Conference");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("tharan");
driver.findElement(By.className("smallSubmit")).click();
String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
System.out.println(text);
}
}




