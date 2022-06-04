package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/register");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("input-username")).sendKeys("sam");
driver.findElement(By.id("input-firstname")).sendKeys("arun");
driver.findElement(By.id("input-lastname")).sendKeys("sree");
		driver.findElement(By.id("input-email")).sendKeys("satya@gmail.com");
		
		WebElement countryse = driver.findElement(By.id("input-country"));
		Select coun=new Select(countryse);
		coun.selectByValue("4");
		driver.findElement(By.id("input-password")).sendKeys("saran");
		
	driver.findElement(By.xpath("//div[@id='button-register']/button")).click();
		driver.close();
}

}
