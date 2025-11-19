package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkktextAss2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement link=driver.findElement(By.linkText("Register"));
		link.click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(500);
		driver.get("https://demowebshop.tricentis.com/");
		
	}

}
