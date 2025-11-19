package SeleniumAssignment.SeleniumAft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Keerthana");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("sathasivam");
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("keerthanasatha01@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Kee123");
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Kee123");
		driver.findElement(By.cssSelector("input[name='register-button']")).click();
		
		
		
		
		
	}
	

}
