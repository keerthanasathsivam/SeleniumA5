package WebElement.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_css_value {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	 WebElement element=driver.findElement(By.xpath("//a[text()='Register']"));
	 String color=element.getCssValue("color");
	 System.out.println(color);
	 driver.quit();
	 
	 
}
}
