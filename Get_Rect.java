package WebElement.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.domsnapshot.model.Rectangle;

public class Get_Rect {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//Rectangle rect =driver.findElement((By.xpath("//input[@id='small-searchterms']")).getRect();
	
}
}
