package WebElement.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_DIsplayed {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	boolean b=driver.findElement(By.xpath("//div[@id='dialog-notification-success']")).isDisplayed();
	System.out.println(b);
	if(b) {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
		
	}
	else {
		System.out.println("Element is not present");
	}
	driver.quit();
}
	}
	

