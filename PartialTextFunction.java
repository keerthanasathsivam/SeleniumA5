package XpathPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialTextFunction {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Blue and green Sneaker')]")).click();
driver.findElement(By.xpath("(//span[contains(@class,'color-container')])[3]")).click();
driver.findElement(By.xpath("//input[@id='add-to-cart-button-28']")).click();

	}
	
}
