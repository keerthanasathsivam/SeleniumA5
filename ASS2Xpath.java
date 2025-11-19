package SeleniumAssignment.SeleniumAft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASS2Xpath {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[3]")).click();
	//driver.findElement(By.xpath(""))
}
}
