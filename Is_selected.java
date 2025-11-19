package WebElement.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	boolean b=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isSelected();
	System.out.println(b);
	driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
	boolean b1=driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected();
	System.out.println(b1);
	driver.quit();
	
	
}
}
